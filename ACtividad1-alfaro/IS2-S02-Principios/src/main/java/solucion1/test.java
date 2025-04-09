/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solucion1;

/**
 *
 * @author L34214
 */
public class test {
    public static void main(String[] args) {
        Libro11= new Libro("Cien años de soledad","Gabriel García Márquez");
        Libro12= new Libro("El señor de los anillos","J. R. R. Tolkien");
        Libro13= new Libro("Don Quijote de la Mancha","Miguel de Cervantes");
        
        Biblioteca b= new Biblioteca();
        b.agregaLibro(l1);
        b.agregaLibro(l2);
        b.agregaLibro(l3);
        
        impresion imp= new impresion();
        
        imp.imprimeResumen(b.get);
        
    }
    
}
