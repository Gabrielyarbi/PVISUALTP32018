/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto7.app;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gabriel
 */
public class GestorAutos {
    private ArrayList<Auto> Autos =new ArrayList<>();

    public ArrayList<Auto> getAutos() {
        return Autos;
    }

    public void setAutos(ArrayList<Auto> Autos) {
        this.Autos = Autos;
    }
    
    public void agregarAutos(Auto a){
    
    this.Autos.add(a);
    
    }/**
     @return Muestra los datos de los autos que estan en la lista de objetos Auto 
     */
    public void mostrarAutos(){
    
    for(Auto a :this.getAutos()){
        System.out.println("Auto n°"+(this.Autos.indexOf(a)+1));
        System.out.println("Patente : "+a.getPatente());
        System.out.println("Marca : "+a.getMarca());
        System.out.println("Modelo :"+a.getModelo());
        System.out.println("Color :"+a.getColor());
        System.out.println("Combustible :"+a.getTipoCombustible());
        System.out.println("------------------------------");
    
    }
    
    
    
    } /**
     @return Permite editar el auto que se selecciono, la seleccion se hace a travez de un numero de auto
     */
    public void editarAuto (int a){
        Scanner sc =new Scanner(System.in);
    Auto b=this.Autos.get(a-1);
        System.out.println("Ingrese Patente ");
    b.setPatente(sc.next());
        System.out.println("Ingrese Marca");
    b.setMarca(sc.next());
        System.out.println("Ingrese Modelo");
    b.setModelo(sc.next());
        System.out.println("Ingrese Color");
    b.setColor(sc.next());
        System.out.println("Ingrese Tipo de combustible");
    b.setTipoCombustible(sc.next());
    
    }
    
}
