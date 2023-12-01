/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        //Productos
        ProductoFresco p1 = new ProductoFresco(
                LocalDate.of(2024, 3, 1), 
                3, "Lechuga");
        
        ProductoFresco p2 = new ProductoFresco(
                LocalDate.of(2023, 12, 18), 
                2.5, "Besugo");
        
        ProductoFresco p3 = new ProductoFresco(
                LocalDate.of(2023, 11, 28), 
                0.5, "Pimiento");
        
        //Prueba métodos
        System.out.println("El precio con iva de p2 es: " 
                + FuncionesProducto.calcularIva(p2));
        
        System.out.println("Días de caducidad que le quedan a p2: " 
                + FuncionesProducto.diasCaducidad(p2));
        
        
        ProductoFresco[] arrayProductos = {p1, p2, p3};
        
        for (int i = 0; i < arrayProductos.length; i++) {
            System.out.println("Precio con IVA de " + arrayProductos[i].getDescripcion() 
                    + ": " + FuncionesProducto.preciosIvaProducto(arrayProductos)[i] + "€");
        }
        
    }
    
}
