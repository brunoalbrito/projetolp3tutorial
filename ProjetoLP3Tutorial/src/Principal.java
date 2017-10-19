
import br.com.mack.lp3.model.User;
import br.com.mack.lp3.persistence.UserDAO;
import java.sql.Connection;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Bruno
 */
public class Principal {

    public static void main(String[] args) {
        //Connection connection = new UserDAO().getConnection();

        //Testando insercao
//        User user = new User("João", "Silva", 'M');
//        UserDAO udao = new UserDAO();
//        if (udao.create(user)) {
//            System.out.println("Usuário inserido com sucesso");
//        }
        
        //Testando buscar todos usuarios
        List<User> users = new UserDAO().findAll();
        for (User u : users) {
            System.out.println(u);
        }
    }
}
