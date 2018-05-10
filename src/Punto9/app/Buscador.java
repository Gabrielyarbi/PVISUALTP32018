/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto9.app;
import punto8.app.Libro;
import punto8.Dominio.Main;
import punto8.app.GestorLibros;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class Buscador {
private String PalbraBuscar;    

   
   

    public String getPalbraBuscar() {
        return PalbraBuscar;
    }

    public void setPalbraBuscar(String PalbraBuscar) {
        this.PalbraBuscar = PalbraBuscar;
    }
    /**
     @return Inicia la busqueda de libros 
     */
    public void buscarLibro (GestorLibros c){
    String P = this.getPalbraBuscar();
    String b;    
    for(Libro a : c.getLibros() ){
    b=a.getTitulo();
    if (b.toLowerCase().contains(P.toLowerCase())){
            System.out.println("-----------------");
            System.out.println("Coincidencias :");
            System.out.println(a.getTitulo());
            System.out.println("-----------------");
    }
   
    }
    
    
    
    
    } 
    
}
