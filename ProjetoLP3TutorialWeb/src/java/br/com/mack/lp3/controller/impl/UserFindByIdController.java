package br.com.mack.lp3.controller.impl;

import br.com.mack.lp3.controller.AbstractController;
import br.com.mack.lp3.model.User;
import br.com.mack.lp3.persistence.UserDAO;

public class UserFindByIdController extends AbstractController{

    @Override
    public void execute() {
        User user = null;
        user =  new UserDAO().findById(Integer.parseInt(request.getParameter("idUsuario")));  
        System.out.println(user.getNome());
        if(user != null){
            request.setAttribute("usuario", user);
            returnPage = "alterar.jsp";
        }else{
            returnPage = "erro.jsp";
        }
    }
    
}
