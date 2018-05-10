/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto3.Dominio;

import Punto3.app.Triangulo;
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
        Triangulo unTriangulo = new Triangulo();
        Scanner scan = new Scanner(System.in);
        try{
        System.out.println("Ingrese lado a del triangulo ");
        unTriangulo.setLadoA(scan.nextInt());
        System.out.println("Ingrese lado b del triangulo ");
        unTriangulo.setLadoB(scan.nextInt());
        System.out.println("Ingrese lado C del triangulo ");
        unTriangulo.setLadoC(scan.nextInt());
        unTriangulo.determinarSiEs(unTriangulo);
    }catch(Exception e){System.out.println("Error debe ingresar enteros");}
    }
}
