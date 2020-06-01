
package com.emergentes.controlador;

import com.emergentes.modelo.productos;
import com.emergentes.modeloDAO.productosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Controlador extends HttpServlet {

    
    productosDAO dao= new productosDAO();
  
    productos p = new productos();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           
    
        String  action = (request.getParameter("action") == null) ? "listar" :request.getParameter("action");
        String acceso="";
        
        if(action.equals("listar"))
        {
            response.sendRedirect("listar.jsp");
        }
        else if(action.equals("add"))
        {
            response.sendRedirect("add.jsp");
        }
        else if(action.equals("editar"))
        {
            request.setAttribute("idP",request.getParameter("id"));
            RequestDispatcher vista=request.getRequestDispatcher("edit.jsp");
            vista.forward(request, response);
        }
        else if(action.equals("eliminar"))
        {
            int idE = Integer.parseInt(request.getParameter("id"));
            
            p.setId(idE);
            
            dao.eliminar(idE);
            
            response.sendRedirect("listar.jsp");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String  action = (request.getParameter("action") == null) ? "listar" :request.getParameter("action");
        String acceso="";
        
        if(action.equalsIgnoreCase("agregar")) 
        {
            String descripcion = request.getParameter("txtdescripcionP");
            int stock = Integer.parseInt(request.getParameter("txtstockP"));

            productos pd = new productos();
            pd.setDescripcion(descripcion);
            pd.setStock(stock);        ;
            
            dao.add(pd);
  
            response.sendRedirect("listar.jsp");
        }
        if(action.equalsIgnoreCase("actualizar")) 
        {
            int id=Integer.parseInt(request.getParameter("txtidP"));
            String descripcion = request.getParameter("txtdescripcionP");
            int stock = Integer.parseInt(request.getParameter("txtstockP"));

            productos pd = new productos();
            pd.setId(id);
            pd.setDescripcion(descripcion);
            pd.setStock(stock);        ;
            
            dao.edit(pd);
  
            response.sendRedirect("listar.jsp");
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
