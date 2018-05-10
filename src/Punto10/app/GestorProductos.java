/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto10.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class GestorProductos {
    private ArrayList<Producto>Productos=new ArrayList<>();

    
    
    
    public ArrayList<Producto> getProdusctos() {
        return Productos;
    }

    public void setProdusctos(ArrayList<Producto> Produsctos) {
        this.Productos = Produsctos;
    }
    
    
    public void agregarProductos(Producto p){
    
    this.Productos.add(p);
    
    }
    /**
     @return Muestra los productos de la lista de productos 
     */
    public void mostrarProductos(){
    
    for (Producto a:this.getProdusctos()){
        System.out.println("------------------------------");
        System.out.println("Producto n°"+(this.Productos.indexOf(a)+1));
        System.out.println("Codigo :"+a.getCodigo());
        System.out.println("Nombre :"+a.getNombre());
        System.out.println("Precio :$"+a.getPrecioU());
        System.out.println("-------------------------------");
    }
        
    }
    /**
     @return Calcula el precio por cuota y el precio final ,Los devuelve por pantalla junto con los datos del producto calculado 
     */
    public void calcularCuotas(){
        Scanner sc=new Scanner(System.in);
        int c,cantidad;
         System.out.println("Ingrese numero de producto a calcular cuotas");
        c=sc.nextInt();
        System.out.println("En cuantas cuotas desea pagar? (Disponible de 1 a 12)");
        cantidad=sc.nextInt();
        
        if (c<=12){
        Producto a= this.Productos.get(c-1);
   double precio=a.getPrecioU();
   double pc,pf;
   double tasa=1.5/100*(cantidad-1); 
   
   pc=precio/cantidad+precio/c*tasa;
    pf=pc*cantidad;
        
    
        System.out.println("----------------------------");
        System.out.println("Codigo Prod :"+ a.getCodigo());
        System.out.println("Producto :"+a.getNombre());
        System.out.println("PrecioUnitario :"+a.getPrecioU());
        System.out.println(c+" Cuotas de :"+pc);
        System.out.println("Precio final :"+pf);
        System.out.println("----------------------------");
  }else{System.out.println("Su tarjeta no permite mas de 12 cuotas ");}
    }
    
}
