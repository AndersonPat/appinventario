/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.business;

import co.com.poli.AppInventario.model.Movimiento;
import java.util.List;

/**
 *
 * @author Anderson
 */
public interface IMovimientoBusiness {
    
    List<Movimiento> obtenerMovimientos();
    public void crearMovimiento(Movimiento movimiento);
    public boolean actualizarMovimiento(Movimiento movimiento);
    public boolean eliminarMovimiento(String idMovimiento);
}
