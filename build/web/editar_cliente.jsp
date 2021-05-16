<%-- 
    Document   : editar_cliente
    Created on : 15/05/2021, 11:13:48 PM
    Author     : Sebastian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EDITAR CLIENTE</title>
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" 
              integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
    </head>
    <body>
        
        <nav class="navbar navbar-light bg-dark">
            <span class="navbar-brand m-auto h1 text-white text-center p-4">FORMULARIO ACTUALIZACION CLIENTES</span>
        </nav>

        <div class="container">

            <div class="row">

                <div  class="col-12 ml-auto" style="margin-top: 50px">

                    <div class="ml-5">

                        <form action="ActualizacionClienteServlet.dll" method="POST" >       

                            <div class="form-group">
                                <input type="text" class="form-control font-italic" name="txtCedulaCiudadania" placeholder="CEDULA DE CIUDADANIA" /><br>
                            </div>
                            
                            <input class="btn btn-success btn-block" type="submit" value="Buscar" />

                        </form>                                     

                    </div>     

                </div>

            </div>

        </div>
        
    </body>
</html>
