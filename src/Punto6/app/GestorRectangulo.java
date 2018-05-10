/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto6.app;
import Punto2.app.Rectangulo;
import java.util.ArrayList;
/**
 *
 * @author Gabriel
 */
public class GestorRectangulo {
    private ArrayList<Rectangulo> Rectangulos=new ArrayList();

    public ArrayList<Rectangulo> getRectangulos() {
        return Rectangulos;
    }

    public void setRectangulos(ArrayList<Rectangulo> Rectangulos) {
        this.Rectangulos = Rectangulos;
    }
    
    public void agregarRectangulo(Rectangulo re){
    this.Rectangulos.add(re);
    }
    
    public void eliminarRectangulo(int r){
    this.Rectangulos.remove(r-1);
    
    }
    /**
     @return Muestra la superficie ,perimetro y los datos de los rectangulos en la lista de objetos rectangulo
     */
    public void mostrarRectangulos(){
       
    for (Rectangulo a : this.getRectangulos()){
    
      System.out.println("Recatangulo "+(this.Rectangulos.indexOf(a)+1));
            System.out.println("Su base es :"+a.getBase()+"   Su altura :"+a.getAltura());
            System.out.println("Su perimetro es :"+a.calcularPerimetro(a.getBase(), a.getAltura()));
            System.out.println("Su Superficie es :"+a.calcularArea(a.getBase(), a.getAltura()));
            System.out.println("------------------------------");
          
    
    }
    
    }
  
}
