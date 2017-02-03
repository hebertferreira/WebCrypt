<%-- 
    Document   : alterarPresunto
    Created on : Feb 3, 2017, 8:29:55 PM
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
        <div>
            <h1>Alterar dados do Cadaver</h1>
        </div>
        <form action="controle.presunto.alterar" method="get">
            Digite o email do Cadaver que terá os dados alterados
            <input type="text" name="txtEmail" value="" placeholder="Digite o email"><br>
            <br>
            Abaixo digite as alterações que serão feitas <br>
            <input type="text" name="txtNome" value="" placeholder="Digite o nome">
            <input type="text" name="txtAltura" value="" placeholder="Digite o altura">
            <input type="text" name="txtPeso" value="" placeholder="Digite o peso">
            <input type="submit" name="salvar" value="Salvar">
            <input type="reset" name="cancelar" value="Cancelar">
        </form>
    </body>
</html>
