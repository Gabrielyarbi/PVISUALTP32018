/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto8.app;

/**
 *
 * @author Gabriel
 */
public class Libro {
    private String titulo,autor;
    private int precio ;
    private int ISBN;

    public Libro(String titulo, String autor, int precio, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.ISBN = ISBN;
    }
    
    
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }


    
    
}
