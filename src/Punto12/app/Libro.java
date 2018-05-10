/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Punto12.app;

/**
 *
 * @author Gabriel
 */
public class Libro {
    private String Titulo;
    private String Categoria;
    private Autor Autor;

    public Libro(String Titulo, String Categoria, Autor Autor) {
        this.Titulo = Titulo;
        this.Categoria = Categoria;
        this.Autor = Autor;
    }

    
    
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public Autor getAutor() {
        return Autor;
    }

    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }

    
}
