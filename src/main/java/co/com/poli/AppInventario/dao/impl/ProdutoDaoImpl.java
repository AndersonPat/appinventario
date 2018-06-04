/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.dao.impl;

import co.com.poli.AppInventario.dao.IProductoDao;
import co.com.poli.AppInventario.data.ProductoData;
import co.com.poli.AppInventario.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anderson
 */
@Repository
public class ProdutoDaoImpl implements IProductoDao {

    @Override
    public List<Producto> obtenerProductos() {
        return ProductoData.getListado();
    }

    @Override
    public void crearProducto(Producto producto) {
        List<Producto> productos = ProductoData.getListado();
        productos.add(producto);
        ProductoData.setListado(productos);
    }

    @Override
    public boolean actualizarProducto(Producto producto) {
        boolean existe = true;
        List<Producto> productos = ProductoData.getListado();
        productos.set(productos.indexOf(producto), producto);
        ProductoData.setListado(productos);
        return existe;
    }

    @Override
    public boolean eliminarProducto(String codigo) {
        boolean existe = true;
        Producto producto = new Producto(codigo, null, null);
        List<Producto> productos = ProductoData.getListado();
        productos.remove(producto);
        ProductoData.setListado(productos);
        return existe;
    }

}
