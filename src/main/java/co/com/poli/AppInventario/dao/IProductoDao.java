/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.dao;

import co.com.poli.AppInventario.model.Producto;
import java.util.List;

/**
 *
 * @author Anderson
 */
public interface IProductoDao {
    
    List<Producto> obtenerProductos();
    public void crearProducto(Producto producto);
    public boolean actualizarProducto(Producto producto);
    public boolean eliminarProducto(String codigo);
}
