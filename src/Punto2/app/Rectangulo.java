/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto2.app;
import Punto1.app.Punto;
/**
 *
 * @author Gabriel
 */
public class Rectangulo {
    
    private int base,altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

 
    
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
            
    public int calcularArea(int b , int a){
    return b*a;
    }

    public int calcularPerimetro(int b , int a){
    return b*2+a*2;
    }
    public void mostrarPuntos ( Punto d, int b , int a){
        
    int p2x = d.getX()+b;
    int p2y=d.getY();
    int p3x=p2x;
    int p3y=d.getY()+a;
    int p4x=d.getX();
    int p4y=d.getY()+a;
        System.out.println(" ------------");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println("*------------");
        System.out.println("Punto Uno : ("+d.getX()+","+d.getY()+")");
    
        System.out.println(" ------------");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println(" ------------*");
        System.out.println("Punto Dos : ("+p2x+","+p2y+")");
        
        System.out.println(" ------------*");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println(" ------------");
        System.out.println("Punto Tres : ("+p3x+","+p3y+")");
    
        System.out.println("*------------");
        System.out.println("|            |");
        System.out.println("|            |");
        System.out.println(" ------------");
        System.out.println("Punto Cuatro : ("+p4x+","+p4y+")");
    }
    
    
}
    

