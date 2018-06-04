/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.business.impl;

import co.com.poli.AppInventario.business.IMovimientoBusiness;
import co.com.poli.AppInventario.model.Movimiento;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Anderson
 */
@Service
public class MovimintoBusinessImpl implements IMovimientoBusiness{
    
    @Autowired
    private IMovimientoBusiness movimientoDao;
    
    @Override
    public List<Movimiento> obtenerMovimientos() {
        return movimientoDao.obtenerMovimientos();
    }

    @Override
    public void crearMovimiento(Movimiento movimiento) {
        movimientoDao.crearMovimiento(movimiento);
    }

    @Override
    public boolean actualizarMovimiento(Movimiento movimiento) {
        return movimientoDao.actualizarMovimiento(movimiento);
    }

    @Override
    public boolean eliminarMovimiento(String idMovimiento) {
        return movimientoDao.eliminarMovimiento(idMovimiento);
    }
    
    
}
