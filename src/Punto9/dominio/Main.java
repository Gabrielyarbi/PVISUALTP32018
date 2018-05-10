/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9.dominio;
import Punto9.app.Buscador;
import java.util.Scanner;
import punto8.app.Libro;
import punto8.app.GestorLibros;

/**
 *
 * @author Gabriel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Buscador B1=new Buscador();
        GestorLibros gl=new GestorLibros();
       Scanner sc=new Scanner(System.in);
        
        Libro l1=new Libro("Cronicas de una muerte anunciada","Gabriel Garcia Marquez", 550, 01);
        Libro l2=new Libro("Cien años de soledad","Gabriel Garcia Marquez", 400, 02);
        Libro l3=new Libro("Noticia de un secuestro","Gabriel Garcia Marquez", 700, 03);
        Libro l4=new Libro("Relato de un naufrago","Gabriel Garcia Marquez", 570, 04);
        
        gl.agragarLibro(l1);
        gl.agragarLibro(l2);
        gl.agragarLibro(l3);
        gl.agragarLibro(l4);
        System.out.println("Ingrese Titulo del libro a buscar");
        B1.setPalbraBuscar(sc.next());
        B1.buscarLibro(gl);
    
    
    }
    
}
