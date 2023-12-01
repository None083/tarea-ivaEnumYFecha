/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author FX506
 */
public class FuncionesProducto {
    
    public static double calcularIva(ProductoFresco p){
        return p.getPrecioSinIva() + (p.getPrecioSinIva() * p.getIva().getPorcentaje());
    }
    
    public static long diasCaducidad(ProductoFresco p){
        if(p.getFECHA_CADUCIDAD() != null){
            return ChronoUnit.DAYS.between(LocalDate.now(), p.getFECHA_CADUCIDAD());
        }
        return Long.MAX_VALUE;
    }
    
    public static double[] preciosIvaProducto(ProductoFresco[] arrayProductos){
        double[] preciosIva = new double[arrayProductos.length];
        
        for (int i = 0; i < arrayProductos.length; i++) {
            preciosIva[i] = calcularIva(arrayProductos[i]);
        }
        return preciosIva;
    }
    
}
