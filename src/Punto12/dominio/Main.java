/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.dominio;


import Punto12.app.Autor;
import Punto12.app.GestorLibros;
import Punto12.app.Libro;
import Punto12.app.GestorAutor;
/**
 *
 * @author Gabriel
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Libro l1=new Libro("Codigo limpio","Programacion", new Autor("Martin","robert"));
       Libro l2=new Libro("No me hagas pensar","Programacion", new Autor("Krug","Steve"));
       Libro l3=new Libro("El libro negro del programador","Programacion",new Autor("Gomes","Rafael"));
       Libro l4=new Libro("Code complete","Programacion", new Autor("McConnel", "Steve"));
       Libro l5=new Libro("Los hombres que no amaban a las mujeres", "Suspenso",new Autor("Larsson", "Stieg"));
       Libro l6=new Libro("Un final perfecto", "Suspenso", new Autor("katzenbach", "Jhon"));
       Libro l7=new Libro("Bajo la misma estrella", "Drama", new Autor("Green", "John"));
       Libro l8=new Libro("Romeo y Julieta", "Drama", new Autor("Sheakespeare", "William"));
       Libro l9=new Libro("El resplandor", "Terror", new Autor("King", "Stephen"));
       Libro l10=new Libro("Dracula", "Terror", new Autor("Stoker", "Bram"));
       Libro l11=new Libro("Console wars", "Informatica", new Autor("Blake", "Harris"));
       GestorLibros gl=new GestorLibros();
      gl.agregarLibro(l1);
      gl.agregarLibro(l2);
      gl.agregarLibro(l3);
      gl.agregarLibro(l4);
      gl.agregarLibro(l5);
      gl.agregarLibro(l6);
      gl.agregarLibro(l7);
      gl.agregarLibro(l8);
      gl.agregarLibro(l9);
      gl.agregarLibro(l10);
      gl.agregarLibro(l11);
      
      gl.agrgarCategoria("Programacion");
      gl.agrgarCategoria("Suspenso");
      gl.agrgarCategoria("Informatica");
      gl.agrgarCategoria("Drama");
      gl.agrgarCategoria("Terror");
    
      
      GestorAutor ga=new GestorAutor();
       ga.agregarAutor(l1.getAutor());
       ga.agregarAutor(l2.getAutor());
       ga.agregarAutor(l3.getAutor());
       ga.agregarAutor(l4.getAutor());
       ga.agregarAutor(l5.getAutor());
       ga.agregarAutor(l6.getAutor());
       ga.agregarAutor(l7.getAutor());
       ga.agregarAutor(l8.getAutor());
       ga.agregarAutor(l9.getAutor());
       ga.agregarAutor(l10.getAutor());
       ga.agregarAutor(l11.getAutor());
       
       
       gl.buscarPor(ga);
       
  }
    }
