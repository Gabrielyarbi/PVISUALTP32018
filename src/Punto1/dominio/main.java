/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto1.dominio;

import Punto1.app.Punto;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Punto unPunto =new Punto();
        Punto puntoDos=new Punto();
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese coordenada x del punto uno :");
        int x =sc.nextInt();
        unPunto.setX(x);
        System.out.println("Ingrese coordenada y del punto uno :");
        int y =sc.nextInt();
        unPunto.setY(y);
        
        System.out.println("Ingrese coordenada x del punto dos :");
        x =sc.nextInt();
        puntoDos.setX(x);
        System.out.println("Ingrese coordenada y del punto dos :");
        y =sc.nextInt();
        puntoDos.setY(y);
        
    double d=unPunto.calcularDistancia(unPunto,puntoDos );
        System.out.println("La distancia entre los puntos es :"+d);
    
    }
    
 }
    

