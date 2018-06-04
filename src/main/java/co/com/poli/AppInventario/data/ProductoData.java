/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.AppInventario.data;

import co.com.poli.AppInventario.model.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson
 */
public class ProductoData {
    private static List<Producto> listado;  
    static{
        listado = new ArrayList<Producto>(){
            {
                add(new Producto("10", "Agua", 10D));
                add(new Producto("20", "Limonada", 20D));
                add(new Producto("30", "Mazamorra", 30D));
         
            }
        };
    }

    public static List<Producto> getListado() {
        return listado;
    }

    public static void setListado(List<Producto> aListado) {
        listado = aListado;
    }
    
    
}
