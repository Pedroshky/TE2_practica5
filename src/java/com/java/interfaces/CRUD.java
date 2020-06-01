/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.interfaces;

import com.emergentes.modelo.productos;
import java.util.List;

/**
 *
 * @author HP I5
 */
public interface CRUD 
{
    public List listar();
    public productos list(int id);
    public boolean add(productos p);
    public boolean edit(productos p);
    public boolean eliminar(int id);
}
