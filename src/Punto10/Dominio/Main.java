/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.Dominio;

import Punto10.app.GestorProductos;
import Punto10.app.Producto;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Producto p1=new Producto(01, "Funda j7", 200.99);
        Producto p2=new Producto(02, "Parlante Bluethot", 10200);
        Producto p3=new Producto(03, "Cargador universal", 300);
        Producto p4=new Producto(04, "Home teatre", 4000);
        Producto p5=new Producto(05, "Play station 2", 1000);
        Producto p6=new Producto(06, "Smart tv", 20000);
        GestorProductos gp=new GestorProductos();
    gp.agregarProductos(p1);
    gp.agregarProductos(p2);
    gp.agregarProductos(p3);
    gp.agregarProductos(p4);
    gp.agregarProductos(p5);
    gp.agregarProductos(p6);
    gp.mostrarProductos();
    int c,cantidad;    
   
    try{
       gp.calcularCuotas();
   }catch(Exception e){System.out.println("Error debe ingresar enteros");}
        
       }
    
}
