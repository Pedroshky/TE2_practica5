
package com.emergentes.modeloDAO;

import com.emergentes.modelo.productos;
import com.emergentes.utiles.ConexionBD;
import com.java.interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP I5
 */
public class productosDAO implements CRUD
{
    ConexionBD cn = new ConexionBD(); 
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    productos p= new productos();

    @Override
    public List listar() 
    {
        ArrayList<productos>list=new ArrayList<>();
        String sql="select * from productos order by id desc";
        
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                productos pr= new productos();
                pr.setId(rs.getInt("id"));
                pr.setDescripcion(rs.getString("descripcion"));
                pr.setStock(rs.getShort("stock"));
                list.add(pr);
            }
        }
        catch(Exception e)
        { 
        
        }
        return list;   
    }

    @Override
    public productos list(int id) {

        String sql="select * from productos where id="+id;
        
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while(rs.next())
            {
                
                p.setId(rs.getInt("id"));
                p.setDescripcion(rs.getString("descripcion"));
                p.setStock(rs.getShort("stock"));
            }
        }
        catch(Exception e)
        { 
        
        }
        return p;        }

    @Override
    public boolean add(productos p) {
        String sql ="insert into productos (descripcion, stock) values ('"+p.getDescripcion()+"','"+p.getStock()+"')";
        
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
        
        }
        return false;    
    }

    @Override
    public boolean edit(productos p) {
        String sql ="update productos set descripcion='"+p.getDescripcion()+"', stock='"+p.getStock()+"' where id="+p.getId();
        
        try{
            con=cn.conectar();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
        
        }
        return false;        }

    @Override
    public boolean eliminar(int id) {
    String sql ="delete from productos where id="+id;
        
        try{
            con=cn.conectar(); 
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        }
        catch(Exception e)
        {
        
        }
        return false;      }
    
}
