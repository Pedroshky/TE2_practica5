<%-- 
    Document   : edit
    Created on : 01-jun-2020, 21:21:31
    Author     : HP I5
--%>

<%@page import="com.emergentes.modelo.productos"%>
<%@page import="com.emergentes.modeloDAO.productosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div>
            <%
                productosDAO dao = new productosDAO();
                int id=Integer.parseInt((String)request.getAttribute("idP"));
                productos p =(productos)dao.list(id);
            %>
        <h1>Editar Producto</h1>
            <form action ="Controlador" method="post">
                <label>Descripcion::</label>
                <input type="text" name="txtdescripcionP" value="<%=p.getDescripcion()%>">
                <br>
                <label>Stock: </label>
                <input type="text" name="txtstockP" value="<%=p.getStock()%>">
                <input type="hidden" name="txtidP" value="<%=p.getId()%>">
                <br>
                <input type="submit" name ="action" value="actualizar">
            </form>
        </div>
    </body>
</html>
