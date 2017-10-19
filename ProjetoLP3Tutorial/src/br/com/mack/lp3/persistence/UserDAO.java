/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.lp3.persistence;

import br.com.mack.lp3.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bruno
 */
public class UserDAO implements GenericDAO<User> {

    public static Connection Connection() {
        Connection connection = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/projetolp3", "root", "admin");
            if (connection != null) {
                System.out.println("STATUS--->Conectado com sucesso!");
            } else {
                System.out.println("STATUS--->Não foi possivel realizar conexão");
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return connection;
    }

    public Connection getConnection() {
        return Connection();
    }

    @Override
    public boolean create(User e) {
        //1 - Preparar retorno
        boolean result = false;

        //2 Abrir conexão
        Connection connection = getConnection();

        //3 - Preparar Query
        String query = "INSERT INTO usuario(nome,sobrenome,sexo)VALUES(?,?,?);";

        try {
            //4- Exercutar insercao
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, e.getNome());
            ps.setString(2, e.getSobrenome());
            //Podemos mandar como String o banco consegue transformar em char
            ps.setString(3, String.valueOf(e.getSexo()));

            //Validar insercao
            result = (ps.executeUpdate() != 0);
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    @Override
    public List findAll() {
        //Crie a lista para retornar os usuarios
        List<User> users = new ArrayList<>();
        //2 Abrir conexão
        Connection connection = getConnection();
        //3 - Preparar Query
        String query = "SELECT nome,sobrenome,sexo FROM usuario;";
        try {
            //4- Exercutar insercao
            PreparedStatement ps = connection.prepareStatement(query);
            //Utilize o executeQuery para obser resultados
            ResultSet rs = ps.executeQuery();
            //Enquando houver resultados ele continua
            while (rs.next()) {
                User user = new User();
                user.setNome(rs.getString("nome"));
                user.setSobrenome(rs.getString("sobrenome"));
                user.setSexo(rs.getString("sexo").charAt(0));

                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }

    @Override
    public User findById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(User e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
