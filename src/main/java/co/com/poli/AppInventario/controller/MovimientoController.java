/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.controller;

import co.com.poli.AppInventario.business.IMovimientoBusiness;
import co.com.poli.AppInventario.model.Movimiento;
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
public class MovimientoController {
 
    @Autowired
    private IMovimientoBusiness movimientoBusiness;
    
    @GetMapping("movimientos")
    public List<Movimiento> obtenerMovimientos(HttpServletResponse hsr) {
        return movimientoBusiness.obtenerMovimientos();
    }

    @PostMapping("movimientos")
    public void crearMovimiento(HttpServletResponse hsr, @RequestBody Movimiento movimiento) {
        movimientoBusiness.crearMovimiento(movimiento);
    }

    @PutMapping("movimientos")
    public boolean actualizarMovimiento(HttpServletResponse hsr, @RequestBody Movimiento movimiento) {
        return movimientoBusiness.actualizarMovimiento(movimiento);
    }

    @DeleteMapping("movimientos/{idMovimiento}")
    public boolean eliminarMovimiento(HttpServletResponse hsr, @PathVariable String idMovimiento) {
        return movimientoBusiness.eliminarMovimiento(idMovimiento);
    }
    
}
