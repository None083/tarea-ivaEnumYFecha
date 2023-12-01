/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.time.LocalDate;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class ProductoFresco {

    private final LocalDate FECHA_CADUCIDAD;
    private static final int DIAS_CADUCIDAD_MAX = 45;
    private static int contador;
    
    private String id;
    private double precioSinIva;
    private String descripcion;
    private IVA iva;

    public ProductoFresco(LocalDate FECHA_CADUCIDAD, double precioSinIva, String descripcion) {
        
        if(FECHA_CADUCIDAD.isAfter(LocalDate.now().plusDays(DIAS_CADUCIDAD_MAX))){
            this.FECHA_CADUCIDAD = null;
        }else{
            this.FECHA_CADUCIDAD = FECHA_CADUCIDAD;
        }
        contador++;
        this.id = String.valueOf(contador);
        this.precioSinIva = precioSinIva;
        this.descripcion = descripcion;
        this.iva = ivaAleatorio();
    }

    public ProductoFresco(LocalDate FECHA_CADUCIDAD) {
        
        if(FECHA_CADUCIDAD.isAfter(LocalDate.now().plusDays(DIAS_CADUCIDAD_MAX))){
            this.FECHA_CADUCIDAD = null;
        }else{
            this.FECHA_CADUCIDAD = FECHA_CADUCIDAD;
        }
        contador++;
        this.id = String.valueOf(contador);
        this.iva = ivaAleatorio();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPrecioSinIva(double precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setIva(IVA iva) {
        this.iva = iva;
    }

    public LocalDate getFECHA_CADUCIDAD() {
        return FECHA_CADUCIDAD;
    }

    public String getId() {
        return id;
    }

    public double getPrecioSinIva() {
        return precioSinIva;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public IVA getIva() {
        return iva;
    }
    
    private IVA ivaAleatorio() {
        IVA[] valores = IVA.values();
        Random random = new Random();
        return valores[random.nextInt(valores.length)];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductoFresco{");
        sb.append("FECHA_CADUCIDAD=").append(FECHA_CADUCIDAD);
        sb.append(", id=").append(id);
        sb.append(", precioSinIva=").append(precioSinIva);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", iva=").append(iva);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
