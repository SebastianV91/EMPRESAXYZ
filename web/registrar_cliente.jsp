<%-- 
    Document   : registrar_cliente
    Created on : 15/05/2021, 12:38:36 PM
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

    </head>
    <body>

        <nav class="navbar navbar-light bg-dark">
            <span class="navbar-brand m-auto h1 text-white text-center p-4">FORMULARIO REGISTRO CLIENTES</span>
        </nav>

        <div class="container">

            <div class="row">

                <div  class="col-12 ml-auto" style="margin-top: 50px">

                    <div class="ml-5">

                        <form action="ServletCliente" method="POST" >       

                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtCedulaCiudadania" placeholder="CEDULA DE CIUDADANIA" /><br>
                            </div>
                            
                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtNombre" placeholder="NOMBRE" /><br>
                            </div>

                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtApellido" placeholder="APELLIDO" /><br>
                            </div>

                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtDireccion" placeholder="DIRECCION" /><br>
                            </div>

                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtTelefono" placeholder="TELEFONO" /><br>
                            </div>

                            <input class="btn btn-success btn-block" type="submit" name="accion" value="Guardar" />

                        </form>                                     

                    </div>     

                </div>

            </div>

        </div>

    </body>
    
</html>
