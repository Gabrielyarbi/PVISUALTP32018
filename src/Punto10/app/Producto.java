/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.app;

/**
 *
 * @author Gabriel
 */
public class Producto {
    private int codigo;
    private String Nombre;
    private double precioU;

    public Producto(int codigo, String Nombre, double precioU) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.precioU = precioU;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }
    


}
