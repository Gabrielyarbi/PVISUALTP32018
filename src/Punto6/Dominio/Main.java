/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.Dominio;

import Punto2.app.Rectangulo;
import Punto6.app.GestorRectangulo;
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
        Rectangulo r1=new Rectangulo(4, 3);
        Rectangulo r2= new Rectangulo(3, 2);
        Rectangulo r3=new Rectangulo(5, 2);
        GestorRectangulo gr=new GestorRectangulo();
       gr.agregarRectangulo(r1);
       gr.agregarRectangulo(r2);
       gr.agregarRectangulo(r3);
       
       gr.mostrarRectangulos();
      
        System.out.println("Ingrese un numero de Rectangulo a eliminar");
        int n =sc.nextInt();
    gr.eliminarRectangulo(n);
        System.out.println("----------------------------");
        System.out.println("Se a eliminda el rectangulo "+n);
        System.out.println("----------------------------");
        gr.mostrarRectangulos();
    
    }
}