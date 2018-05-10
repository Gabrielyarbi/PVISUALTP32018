/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.app;

/**
 *
 * @author Gabriel
 */
public class Zapatilla {
    private String marca,calidad;
    private int Precio , talle;
    /**
     * @return precio de la zapatilla
     */
    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    public int getTalle() {
        return talle;
    }

    public void setTalle(int talle) {
        this.talle = talle;
    }

    public Zapatilla(String marca, String calidad) {
        this.marca = marca;
        this.calidad = calidad;
    }
    
    
    

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public Zapatilla(String marca, String calidad, int Precio, int talle) {
        this.marca = marca;
        this.calidad = calidad;
        this.Precio = Precio;
        this.talle = talle;
    }
    
}
