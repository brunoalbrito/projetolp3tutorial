<%-- 
    Document   : listarUsuarios
    Created on : 19/10/2017, 20:13:39
    Author     : Bruno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar Usuarios</title>
    </head>
    <body>
        <h1>Listando todos os usuarios</h1>


        <c:forEach var="i" items="${usuarios}">
            ${i}</br>
        </c:forEach>
            
            
        <h1>Digite o id do qual deseja alterar</h1>
        <form method="POST" action="FrontController">
            <input name="idUsuario" placeholder="Id do Usuario" autofocus="true">
            <input type="hidden" name="command" value="UserFindById">
            <input type="submit" value="Buscar">
        </form>
            
    </body>
</html>
