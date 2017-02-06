<%-- 
    Document   : resultado
    Created on : Jan 30, 2017, 12:26:30 AM
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
        <h1>Informativo do Sepultado</h1>
        
        <b>${mensagem}</b>
        <div>
            <br>
            ${finado.nome}<br>
            ${finado.email}<br>
            ${finado.altura}<br>
            ${finado.peso}<br>
        </div> 
        <br>
        <input type="text" name="txtBancoNome" value= "${finado.nome}" placeholder="${finado.email}">
        <a href="index.html">Voltar a pagina principal</a>
    </body>
</html>
