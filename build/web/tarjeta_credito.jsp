<%-- 
    Document   : cliente
    Created on : 15/05/2021, 12:32:18 PM
    Author     : Sebastian
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TARJETA DE CREDITO</title>
    </head>
    <body>
        
        <center>
        
        <div>
            <h3>CLIENTES</h3>
            
            <form action="ServletTarjetaCredito" method="POST" >
            
                <input type="submit" name="accion" value="Nuevo" />
            
            </form>
            
        </div>
        
    </center>
        
    </body>
</html>
