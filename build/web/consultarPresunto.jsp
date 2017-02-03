<%-- 
    Document   : incluirPresunto
    Created on : Feb 1, 2017, 8:26:32 PM
    Author     : hebertferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <h1>Procurar um Finado</h1>
        <form action="controle.presunto.buscar" method="get">
            <input type="text" name="txtNome" value="" placeholder="Nome do cabra">
            
            <input type="submit" value="Procurar">
            <input type="reset" value="Cancelar">
        </form>
    </body>
</html>
