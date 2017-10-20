package br.com.mack.lp3.controller.impl;

import br.com.mack.lp3.controller.AbstractController;
import br.com.mack.lp3.model.User;
import br.com.mack.lp3.persistence.UserDAO;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class UserFindAllController extends AbstractController {

    @Override
    public void execute() {
        ArrayList<User> users = (ArrayList<User>) new UserDAO().findAll();

        if (!users.isEmpty()) {
            request.setAttribute("usuarios", users);
            if(request.getParameter("redirect").equals("listarUsuarios")){
                returnPage = "listarUsuarios.jsp";
            }else{
                returnPage = "listarUsuariosAlteracao.jsp";
            }
        } else {
            returnPage = "erro.jsp";
        }
    }

}
