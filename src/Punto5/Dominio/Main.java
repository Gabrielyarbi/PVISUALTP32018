/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.Dominio;

import Punto5.app.Circulo;
import Punto5.app.GestorCirculos;
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
        
        Circulo c1=new Circulo(3, "azul");
        Circulo c2=new Circulo(4, "Amarillo");
        
        GestorCirculos Gestor=new GestorCirculos();
        
        Gestor.agregarCirculos(c1);
        Gestor.agregarCirculos(c2);
         String resp;
        
        Scanner sc =new Scanner(System.in);
        do{
        System.out.println("Agregue un circulo a la lista");
        System.out.println("Ingrese radio");
        int ra=sc.nextInt();
        System.out.println("Ingrese Color");
        String c=sc.next();
        Circulo c3=new Circulo(ra, c);
        Gestor.agregarCirculos(c3);
        System.out.println("¿Desea agregar otro? (Tecla n para cancelar)");
         resp=sc.next();
        }while(!resp.equals("n"));
        System.out.println("---------------------");
        System.out.println("Los corculos son :");
        System.out.println("---------------------");
        for(Circulo a :Gestor.getCirculos()){
            System.out.println("Radio Circulo : "+a.getRadio() );
            System.out.println("Color Circulo : "+a.getColor());
            System.out.println("Superficie : "+a.calcularSup(a.getRadio()));
            System.out.println("Perimetro : "+a.calcularPer(a.getRadio()));
            System.out.println("");
            
            
    }
    
}

}