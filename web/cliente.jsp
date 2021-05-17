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
        <title>CLIENTE</title>
    </head>
    <body>
        
    <center>
        
        <div>
            <h3>CLIENTES</h3>
            
            <form action="ServletCliente" method="POST" >
            
                <input type="submit" name="accion" value="Lista" />
                <input type="submit" name="accion" value="Nuevo" />
            
            </form>
            
        </div>
        
        <div>
            
            <table border="1">
                <thead>
                    <th>CEDULA DE CIUDADANIA</th>
                    <th>NOMBRE</th>
                    <th>APELLIDO</th>
                    <th>DIRECCION</th>
                    <th>TELEFONO</th>
                    <th>ACCIONES</th>
                </thead>
                <tbody>
                    <c:forEach var="dato" items="${datos}">
                    <tr>
                        <td>${dato.getCedulaCiudadania()}</td>
                        <td>${dato.getNombre()}</td>
                        <td>${dato.getApellido()}</td>
                        <td>${dato.getDireccion()}</td>
                        <td>${dato.getTelefono()}</td>
                        <td>
                            <form action="ServletCliente" method="POST" >
                                <input type="hidden" name="id" value="${dato.getIdCliente()}" />
                                <input type="submit" name="accion" value="Editar" />
            <!--                    <input type="submit" name="accion" value="Eliminar" />              -->
                            </form>
                        </td>
                    </tr>
                    </c:forEach>
                </tbody>

            </table>
            
        </div>
        
        
        
    </center>    
        
    </body>
</html>
