/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.Dominio;

import java.util.Scanner;
import punto8.app.GestorLibros;
import punto8.app.Libro;

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
        
        Libro l1=new Libro("Cronicas de una muerte anunciada", "Gabriel Garcia Marquez", 550, 01);
        Libro l2=new Libro("Cien años de soledad","Gabriel Garcia Marquez", 400, 02);
        Libro l3=new Libro("Noticia de un secuestro","Gabriel Garcia Marquez", 700, 03);
        Libro l4=new Libro("Relato de un naufrago","Gabriel Garcia Marquez", 570, 04);
        
        GestorLibros gl=new GestorLibros();
        
        gl.agragarLibro(l1);
        gl.agragarLibro(l2);
        gl.agragarLibro(l3);
        gl.agragarLibro(l4);
        
        gl.mostrarLibros();
         
        String r;
        System.out.println("Quiere Agregar Otro libro a la lista?");
            System.out.println("Precione cualquier tecla para continuar y n para cancelar");
            r=sc.next();
        while ( ! r.equals("n")){
            
          gl.definirLibrosNuevo();
          System.out.println("_________________");
          System.out.println("Lista actualizada");
          System.out.println("_________________");
          gl.mostrarLibros();
          System.out.println("Quiere Agregar Otro libro a la lista?");
            System.out.println("Precione la tecla S para continuar y cualquier tecla para cancelar");
            r=sc.next();
        } 
          
    }
    
}
