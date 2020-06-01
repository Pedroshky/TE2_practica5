<%-- 
    Document   : add
    Created on : 01-jun-2020, 21:03:48
    Author     : HP I5
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Nuevo Producto</h1>
        <form action ="Controlador" method="post">
            <label>Descripcion::</label>
            <input type="text" name="txtdescripcionP">
            <br>
            <label>Stock: </label>
            <input type="text" name="txtstockP">
            <br>
            <input type="submit" name ="action" value="agregar">
        </form>
    </body>
</html>
