<%-- 
    Document   : index
    Created on : 19/10/2017, 19:56:29
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href="cadastrarUsuario.jsp"><button>Cadastrar</button></a>
        <a href="${pageContext.servletContext.contextPath}/FrontController?command=UserFindAll&redirect=listarUsuarios">
            <button>Listar todos usuarios</button>
        </a>
            <a href="${pageContext.servletContext.contextPath}/FrontController?command=UserFindAll&redirect=listarUsuariosAlteracao">
                <button>Alterar</button>
            </a>
    </body>
</html>
