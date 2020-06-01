<%-- 
    Document   : listar
    Created on : 01-jun-2020, 20:34:46
    Author     : HP I5
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
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
       
        <h1>Productos</h1>
        <a href="Controlador?action=add">Nuevo Producto</a>
        <br>
        <table border="1">
                <thead>
                    <tr>
                        <th>Codigo</th>
                        <th>Descripcion</th>
                        <th>Stock</th>
                        <th>acciones</th>
                    </tr>                    
                </thead>
                <%
                    productosDAO  Pdao = new productosDAO();
                    List<productos>list = Pdao.listar();
                    Iterator<productos>iter = list.iterator();
                    productos pd=null;
                    
                    while(iter.hasNext())
                    {
                        pd=iter.next();
                    
                    
                 /*
                    nUsuarioDAO nDAO = new nUsuarioDAO();
                    List<nBlog>list = nDAO.listar();
                    Iterator<nBlog>iter= list.iterator();
                    nBlog nBg=null;
                    
                    while(iter.hasNext()){
                        nBg=iter.next();
                   */ 
                %>
                <tbody>
                    <tr>    
                        <td><%=pd.getId()%></td>
                        <td><%=pd.getDescripcion()%></td>
                        <td><%=pd.getStock()%></td>
                        <td>
                            <a href="Controlador?action=editar&id=<%=pd.getId()%>">editar</a>
                            <a href="Controlador?action=eliminar&id=<%=pd.getId()%>">eliminar</a>
                        </td>
                    </tr>
                    
                   <%
                        }
                   %> 
                </tbody>
            </table>

    </body>
</html>
