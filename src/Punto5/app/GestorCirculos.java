/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto5.app;

import java.util.ArrayList;

/**
 *
 * @author Gabriel
 */
public class GestorCirculos {
    
    private ArrayList<Circulo> circulos = new ArrayList();

    public ArrayList<Circulo> getCirculos() {
        return circulos;
    }

    public void setCirculos(ArrayList<Circulo> circulos) {
        this.circulos = circulos;
    }
     /**
      @return Agrega un objeto circulo a la lista de cirulos 
      */   
   public void agregarCirculos(Circulo a){
   
   this.circulos.add(a);
   
   }




}
    

