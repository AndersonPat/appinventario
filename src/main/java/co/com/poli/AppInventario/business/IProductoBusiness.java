/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.business;

import co.com.poli.AppInventario.model.Producto;
import java.util.List;

/**
 *
 * @author Anderson
 */
public interface IProductoBusiness {
    
    List<Producto> obtenerProducto();
    public void CrearProducto(Producto producto);
    public boolean actualizarProducto(Producto producto);
    public boolean eliminarProducto(String codigo);
}
