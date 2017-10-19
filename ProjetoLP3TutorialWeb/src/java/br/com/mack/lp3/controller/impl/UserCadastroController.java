/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.mack.lp3.controller.impl;

import br.com.mack.lp3.controller.AbstractController;
import br.com.mack.lp3.model.User;
import br.com.mack.lp3.persistence.UserDAO;

/**
 *
 * @author Bruno
 */
public class UserCadastroController extends AbstractController{

    @Override
    public void execute() {
        //1 Criar o objeto UserDAO
        UserDAO udao =  new UserDAO();
        //Criar o objeto Usuario
        User user =  new User();
        user.setNome(request.getParameter("nome"));
        user.setSobrenome(request.getParameter("sobrenome"));
        user.setSexo(request.getParameter("sexo").charAt(0));
        
        if(udao.create(user)){
            returnPage = "sucesso.jsp";
        }else{
            returnPage = "erro.jsp";
        }
    }
    
}
