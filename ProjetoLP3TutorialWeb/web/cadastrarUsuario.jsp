<%-- 
    Document   : cadastrarUsuario
    Created on : 18/10/2017, 17:54:31
    Author     : Bruno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastrar Usuario</title>
    </head>
    <body>
        <form action="FrontController" method="GET">
            <input type="text" name="nome" autofocus placeholder="Nome">
            <input type="text" name="sobrenome" autofocus placeholder="Sobrenome">
            <input type="text" name="sexo" autofocus placeholder="M ou F">
            <input hidden name="command" value="UserCadastro">
            <input type="submit">
        </form>
    </body>
</html>
