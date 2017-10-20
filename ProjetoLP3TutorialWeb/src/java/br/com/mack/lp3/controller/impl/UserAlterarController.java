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
public class UserAlterarController extends AbstractController {

    @Override
    public void execute() {
        long id = Long.parseLong(request.getParameter("idUsuario"));
        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        char sexo = request.getParameter("sexo").charAt(0);

        User user = new User(nome, sobrenome, sexo);
        user.setIdUsuario(id);

        if (new UserDAO().update(user)) {
            returnPage = "sucesso.jsp";
        } else {
            returnPage = "erro.jsp";
        }

    }
}
