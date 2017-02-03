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
        
        <h1>Incinerador de Defuntos</h1>
        <form action="controle.presunto.excluir" method="get">
            <input type="text" name="txtNome" value="" placeholder="Nome do finado">
            <input type="text" name="txtEmail" value="" placeholder="Email do finado">            
            <input type="submit" value="Incinerar">
            <input type="reset" value="Limpar">
        </form>
    </body>
</html>
