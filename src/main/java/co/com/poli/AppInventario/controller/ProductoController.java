/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.controller;

import co.com.poli.AppInventario.business.IProductoBusiness;
import co.com.poli.AppInventario.model.Producto;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Anderson
 */
@RestController
@RequestMapping(value = "/")
public class ProductoController {
    
    @Autowired
    private IProductoBusiness productoBusiness;
    
    @GetMapping("productos")
    public List<Producto> obtenerProductos(HttpServletResponse hsr){
        return productoBusiness.obtenerProducto();
    }
   
    @PostMapping("productos")
    public void crearProducto(HttpServletResponse hsr, @RequestBody Producto producto){
        productoBusiness.CrearProducto(producto);
    }
    
    @PutMapping("productos")
    public boolean actualizarProductos(HttpServletResponse hsr, @RequestBody Producto producto){
        return productoBusiness.actualizarProducto(producto);
    }
    
    @DeleteMapping("productos/{codigo}")
    public boolean eliminarProductos(HttpServletResponse hsr, @PathVariable String codigo){
        return productoBusiness.eliminarProducto(codigo);
    }
}
