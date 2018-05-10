/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.dominio;

import Punto11.app.GestorZapatillas;
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
        GestorZapatillas gz=new GestorZapatillas();
        System.out.println("Desea Ingresar una Zapatilla?");
        System.out.println("Presione S para continuar y cualquier tecla para cancelar");
        System.out.println("----------------------------------");
        String r=sc.next();
        while (r.equals("s")||r.equals("S")){
        gz.definirNuevaZapatilla();
        System.out.println("----------------------------------");
       System.out.println("Desea Ingresar otra Zapatilla?");
        System.out.println("Presione S para continuar y cualquier tecla para cancelar");
        System.out.println("----------------------------------");
        r=sc.next();
        } 
        System.out.println("----------------------------------");
            System.out.println("Desea Mostrar la lista de Zapatillas?(s/n)");
            System.out.println("S para aceptar n para cancelar");
            System.out.println("----------------------------------");
            String resp=sc.next();
            if (resp.equals("s")||resp.equals("S")){
                if(gz.getZapatillas().isEmpty()){
                System.out.println("----------------------------------");
                    System.out.println("Lista vacia ,No ingreso ninguna zapatilla");
                    System.out.println("----------------------------------");
                }else{
                gz.mostrarZapatillas();
                }
            }else{System.out.println("----------------------------------");
                System.out.println("Fin del programa");
            System.out.println("----------------------------------");}
       
           
    
    }
    
}
