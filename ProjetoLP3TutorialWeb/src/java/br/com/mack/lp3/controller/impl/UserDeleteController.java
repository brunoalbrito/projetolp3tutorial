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
public class UserDeleteController extends AbstractController{

    @Override
    public void execute() {
        User user = new User();
        user.setIdUsuario(Long.parseLong(request.getParameter("idUsuario")));
        
        System.out.println("Passou aqui");
        
        if(new UserDAO().delete(user)){
            returnPage = "sucesso.jsp";
        }else{
            returnPage = "erro.jsp";
        }
    }
    
}
