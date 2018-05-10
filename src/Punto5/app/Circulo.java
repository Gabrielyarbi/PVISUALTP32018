/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.app;

/**
 *
 * @author Gabriel
 */
public class Circulo {
    private double Radio;
    private String Color;

    public Circulo(double Radio, String Color) {
        this.Radio = Radio;
        this.Color = Color;
    }

   
    
    public double getRadio() {
        return Radio;
    }

    public void setRadio(int Radio) {
        this.Radio = Radio;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }
    public double calcularSup(double r){
    
    return Math.PI*Math.pow(r, 2);
    
    }
    public double calcularPer(double r){
    
    return 2*Math.PI*r;
    }
    
    
    
}
