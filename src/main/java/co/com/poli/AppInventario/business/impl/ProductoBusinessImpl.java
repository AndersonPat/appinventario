/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.business.impl;

import co.com.poli.AppInventario.business.IProductoBusiness;
import co.com.poli.AppInventario.dao.IProductoDao;
import co.com.poli.AppInventario.model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anderson
 */
@Service
public class ProductoBusinessImpl implements IProductoBusiness{

    
    @Autowired
    private IProductoDao productoDao;
    
    @Override
    public List<Producto> obtenerProducto() {
        return productoDao.obtenerProductos();
    }

    @Override
    public void CrearProducto(Producto producto) {
        productoDao.crearProducto(producto);
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
        return productoDao.actualizarProducto(producto);
    }

    @Override
    public boolean eliminarProducto(String codigo) {
        return productoDao.eliminarProducto(codigo);
    }
    
}
