/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.app;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gabriel
 */
public class GestorLibros {
    
private ArrayList<Libro> Libros=new ArrayList<>();

    public ArrayList<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(ArrayList<Libro> Libros) {
        this.Libros = Libros;
    }
    public void agragarLibro(Libro a){
       
        
    this.Libros.add(a);
    
    }
    /**
     @return  Muestra la lista de objetos libros y sus datos
     */
    public void mostrarLibros(){
    
    for (Libro a : this.getLibros()){
    
        System.out.println("Libro N°"+(this.Libros.indexOf(a)+1));
        System.out.println("ISBN :"+a.getISBN());
        System.out.println("Titulo :"+a.getTitulo());
        System.out.println("Autor :"+a.getAutor());
        System.out.println("Precio :$"+a.getPrecio());
        System.out.println("--------------------");
    }
    
    }
    /**
     @return Inucia la carga de datos de libros y luego carga los libros a la lista de objetos libros 
     */
    public void definirLibrosNuevo(){
        Scanner sc=new Scanner(System.in);
        int p,i;
        String titulo ,autor;
        Libro l5;
        
            System.out.println("Ingrese titulo");
            titulo=sc.next();
            System.out.println("Ingrese autor");
            autor=sc.next();
            System.out.println("Ingrese precio");
            p=sc.nextInt();
            System.out.println("Ingrese ISBN");
            i=sc.nextInt();
        l5  =new Libro(titulo, autor, p, i);
        agragarLibro(l5);
                
    }
}
