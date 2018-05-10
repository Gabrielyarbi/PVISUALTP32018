/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.app;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author maru original
 *@author Gabriel
 */
public class GestorLibros {
    private List<Libro> Libros=new ArrayList<>();
    private List<String>Categorias=new ArrayList<>();

    
    
    
    
    public List<String> getCategorias() {
        return Categorias;
    }

    public void setCategorias(List<String> Categorias) {
        this.Categorias = Categorias;
    }

    public List<Libro> getLibros() {
        return Libros;
    }

    public void setLibros(List<Libro> Libros) {
        this.Libros = Libros;
    }
   

  
public void agrgarCategoria (String a){

this.Categorias.add(a);
}    

public void agregarLibro (Libro l){

this.Libros.add(l);

}
/**
 @return Muestra las categorias de la lista de categorias 
 */
public void mostrarCategorias(){
    System.out.println("-------------------------");
    System.out.println("Las categorias son :");
    System.out.println("-------------------------");

    for ( String b : this.getCategorias()){
    System.out.println("------------------------------");    
    System.out.println( "N°"+(this.getCategorias().indexOf(b)+1)+" "+b );
    System.out.println("------------------------------");
}
}
/**
 @return Inicia la busqueda de libros
 */

public void buscarPor (GestorAutor g){
    Scanner sc=new Scanner(System.in);
    int resp ;
    System.out.println("1-Buscar por autor");    
    System.out.println("2-Buscar por Categoria y autor");
    System.out.println("3-Salir");
    try{
    resp = sc.nextInt();
    
    switch  (resp) {
    
        case 1 :{
            g.mostrarAutores();
            System.out.println("Elija un numero de autor ");
            int Autr=sc.nextInt();
           Autor A = g.getAutores().get(Autr-1);
            System.out.println("Autor N°"+Autr);
            System.out.println("Nombre :"+A.getNombre());
            System.out.println("Apellido :"+A.getApellido());
            System.out.println("-----------------------------");
            System.out.println("Libros encontrados :");
            for (Libro z :this.getLibros()){
            if (z.getAutor().getApellido().equals(A.getApellido())){
            
                System.out.println("Titulo :"+z.getTitulo());
                System.out.println("Categoria :"+z.getCategoria());
                System.out.println("Autor :"+z.getAutor().getNombre()+" "+z.getAutor().getApellido());
            }
            
            
            }
            
        } break;
        case 2 :{
        
            this.mostrarCategorias();
            System.out.println("Elija un numero de categoria ");
            int r =sc.nextInt();
           String cb = this.Categorias.get(r-1);
            System.out.println("Los autores para esta categoria son :");
            System.out.println("--------------------------------------");
           for (Libro lib : this.getLibros()){
           if (cb.equals(lib.getCategoria())){
               System.out.println("Autor n°"+(g.getAutores().indexOf(lib.getAutor())+1));
               System.out.println("Nombre :"+lib.getAutor().getNombre());
               System.out.println("Apellido :"+lib.getAutor().getApellido());
                }
           }
            System.out.println("Ingrese el numero del autor ");
            r=sc.nextInt();
            Libro l =this.getLibros().get(r-1);
            System.out.println("Libros encontrados :");
            System.out.println("---------------------");
            for (Libro li :this.getLibros()){
                if (l.getAutor().getApellido().equals(li.getAutor().getApellido())){
                
                    System.out.println("Libro N° "+(this.getLibros().indexOf(li)+1));
                    System.out.println("Titulo :"+li.getTitulo());
                    System.out.println("Autor :"+li.getAutor().getNombre()+" "+li.getAutor().getApellido());
                    System.out.println("Categoria :"+li.getCategoria());
                }
        
        }
        } break;
                
        default :{ 
            System.out.println("------------------");
            System.out.println("Fin del programa");
            System.out.println("------------------");
        } break;
    
    }

}catch(Exception e){
        System.out.println("!ERROR! Debe ingresar una opcion valida");

}
}
}


