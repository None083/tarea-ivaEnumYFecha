/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

/**
 *
 * @author FX506
 */
public enum IVA {
    
    SIETE(0.07),
    DIECISEIS(0.16),
    VEINTIUNO(0.21);

    private final double porcentaje;

    IVA(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double getPorcentaje() {
        return porcentaje;
    }
    
}
