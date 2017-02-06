
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
        
        <h1>Cadastro de Novo Presunto</h1>
        <form action="controle.presunto.incluir" method="post">
            <input type="text" name="txtNome" value="" placeholder="Nome do presunto">
            <input type="text" name="txtEmail" value="" placeholder="Email do finado">
            <input type="text" name="txtAltura" value="" placeholder="Altura">
            <input type="text" name="txtPeso" value="" placeholder="Peso">
            <input type="submit" value="Salvar">
            <input type="reset" value="Limpar">
        </form>
    </body>
</html>
