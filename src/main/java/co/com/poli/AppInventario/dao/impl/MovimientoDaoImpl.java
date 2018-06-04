/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.dao.impl;

import co.com.poli.AppInventario.dao.IMovimientoDao;
import co.com.poli.AppInventario.data.MovimientoData;
import co.com.poli.AppInventario.model.Movimiento;
import co.com.poli.AppInventario.model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Anderson
 */
@Repository
public class MovimientoDaoImpl implements IMovimientoDao {

    @Override
    public List<Movimiento> obtenerMovimientos() {
        return MovimientoData.getListado();
    }

    @Override
    public void crearMovimiento(Movimiento movimiento) {
        List<Movimiento> movimientos = MovimientoData.getListado();
        movimientos.add(movimiento);
        MovimientoData.setListado(movimientos);
    }

    @Override
    public boolean actualizarMovimiento(Movimiento movimiento) {
        boolean actualizo = true;
        List<Movimiento> movimientos = MovimientoData.getListado();
        movimientos.set(movimientos.indexOf(movimiento), movimiento);
        MovimientoData.setListado(movimientos);
        return actualizo;
    }

    @Override
    public boolean eliminarMovimiento(String idMovimiento) {
        boolean elimino = true;
        List<Movimiento> movimientos = MovimientoData.getListado();
        Movimiento movimiento = new Movimiento(idMovimiento, new Producto(), 0D, "", 0D);
        movimientos.remove(movimiento);        
        MovimientoData.setListado(movimientos);
        return elimino;
    }

}
