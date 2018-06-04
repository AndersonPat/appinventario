/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.data;

import co.com.poli.AppInventario.model.Movimiento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class MovimientoData {
    private static List<Movimiento> listado;

    static {
        listado = new ArrayList<Movimiento>() {
        };
    }

    public static List<Movimiento> getListado() {
        return listado;
    }

    public static void setListado(List<Movimiento> listado) {
        MovimientoData.listado = listado;
    }
}
