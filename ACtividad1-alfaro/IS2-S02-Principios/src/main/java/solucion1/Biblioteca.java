package solucion1;

import pe.edu.ulima.cohesion.*;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
       private List<Libro> libros;

    public Biblioteca(List<solucion1.Libro> libros) {
        this.libros = libros;
    }

   

    public void agregaLibro(Libro l) {
        libros.add(l);
    }

    public List<Libro> getLibros() {
        return libros;
    }


}
