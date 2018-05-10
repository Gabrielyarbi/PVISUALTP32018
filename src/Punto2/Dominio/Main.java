/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.Dominio;

import Punto1.app.Punto;
import Punto2.app.Rectangulo;
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
        Scanner sc =new Scanner(System.in);
        System.out.println("Ingrese base ");
        int b =sc.nextInt();
        System.out.println("Ingrese altura ");
        int a =sc.nextInt();
        System.out.println("Ingrese punto x ");
        int p1=sc.nextInt();
        System.out.println("Ingrese punto y ");
        int p2=sc.nextInt();
        Rectangulo unRectangulo = new Rectangulo(b, a);
         
        
         
        int sup = unRectangulo.calcularArea(unRectangulo.getBase(), unRectangulo.getAltura());
        int per = unRectangulo.calcularPerimetro(unRectangulo.getBase(), unRectangulo.getAltura());
         System.out.println("La superficie del Rectangulo es : "+sup);
         System.out.println("el perimetro del Rectangulo es : "+per);
         Punto Puntouno = new Punto();
         Puntouno.setX(p1);
         Puntouno.setY(p2);
         
         unRectangulo.mostrarPuntos(Puntouno, unRectangulo.getBase(), unRectangulo.getAltura());
    
    }
    
}
