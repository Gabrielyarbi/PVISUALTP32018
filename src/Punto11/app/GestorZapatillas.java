/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto11.app;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.runtime.JSType;
/**
 *
 * @author Gabriel
 */
public class GestorZapatillas {
    private ArrayList<Zapatilla>Zapatillas=new ArrayList<>();

    public ArrayList<Zapatilla> getZapatillas() {
        return Zapatillas;
    }
    
   
    public void setZapatillas(ArrayList<Zapatilla> Zapatillas) {
        this.Zapatillas = Zapatillas;
    }
   public void agregarZapatillas(Zapatilla z){
   this.Zapatillas.add(z);
   
   } 
   /**
    @return Muestra la lista de zapatillas 
    */
    public void mostrarZapatillas(){

for (Zapatilla z : this.getZapatillas()){
        System.out.println("-------------------------");
        System.out.println("Zapatilla n°"+(this.Zapatillas.indexOf(z)+1));
        System.out.println("Marca :"+z.getMarca());
        System.out.println("Calidad :"+z.getCalidad());
        System.out.println("Talle :"+z.getTalle());
        System.out.println("Precio :$"+z.getPrecio());
        System.out.println("-------------------------");
}
}
    /**
     @return Inicia la carga de zapatillas en la lista 
     */
    public void definirNuevaZapatilla(){
        Scanner sc=new Scanner(System.in);
    String M,c;
    int p,t;      
        System.out.println("Ingrese Marca ");
        M =sc.next();
        System.out.println("Ingrese calidad (Original o Copia)");
        c=sc.next();
        
        System.out.println("Ingrese Talle ");
        t=sc.nextInt();
        
        System.out.println("Ingrese Precio");
        p=sc.nextInt();
    
        Zapatilla a=new Zapatilla(M, c, p, t);
        
        agregarZapatillas(a);
    }
}
