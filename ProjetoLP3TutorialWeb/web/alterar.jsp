<%-- 
    Document   : alterar
    Created on : 19/10/2017, 21:01:42
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Alterar</title>
    </head>
    <body>
        <h1>Alterar o usuario selecionado</h1>
        <form action="FrontController" method="POST">
            <input name="idUsuario" type="text" readonly="true" value="${usuario.idUsuario}">
            <input name="nome" type="" value="${usuario.nome}">
            <input name="sobrenome" type="" value="${usuario.sobrenome}">
            <input name="sexo" type="" value="${usuario.sexo}">


            <input name="command" type="hidden" value="UserAlterar">
            <input type="submit" value="Salvar Alteração">
        </form>
        </br>
        <a href="${pageContext.servletContext.contextPath}/FrontController?command=UserDelete&idUsuario=${usuario.idUsuario}">
            <button>Excluir</button>
        </a>
    </body>
</html>
