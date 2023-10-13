/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop4;

/**
 *CLASE PRINCIPAL POOP4- MAIN 
 * nos guarda los datos de las demas clases 
 *
 */
public class POOP4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * se crea una instancia, tipo de variable Punto,
         * este consturctor ya nos srive  - New Punto( es un objeto)
         */
        Punto punto = new Punto(); 
        
        System.out.println("-------------------------------------------------------------------------------------");
   
        /**
         * CLASE PUNTO
        */

        punto.imprimirPunto();
        /**
         * Se crea una instancia y le asginamos valores
        */
        Punto punto2 = new Punto(3,5);
        /**
         * 
         * nos va imrpimir punto, pero ya con los vallores que se le asignaron
         */
        punto2.imprimirPunto(); 
        System.out.println(punto);
        
        System.out.println("-------------------------------------------------------------------------------------");

        
        /**
         * CLASE PERRO ------
         * Nos imprimira lo que le asignimos, eso lo hara el toString los concatenar
         */
        Perro perro = new Perro("Torvi", "Pastor Belga","Rojizo",  2);
        System.out.println(perro);
        
        System.out.println("-------------------------------------------------------------------------------------");

        
        /**
         * CLASE COCHE ------
         * Nos imprimira lo que le asignimos, eso lo hara el toString los concatenar
         */
        Coche coche = new Coche("BMW", "2023", "Azul Naval","Diesel", "Automatico"); //instancia
        coche.girar("derecha");
        System.out.println(coche.toString()); //el toString se convierte en una cadena
        System.out.println(coche); // es lo mismo que toString, imprimira lo mismo
        
        System.out.println("-------------------------------------------------------------------------------------");
        
        /**
         * CLASE PROFESOR ------
         * Nos imprimira lo que le asignimos, eso lo hara el toString los concatenar
         */
        Profesor profesor1 = new Profesor("Mauricio", "Doctorado", "Quimica", 46, true);
        profesor1.darClase(true);
        profesor1.horas(3);
        profesor1.calificando("Tareas");
        profesor1.escribir();
        profesor1.calificacion(8.0f);
        System.out.println(profesor1);
        
       
        System.out.println("-------------------------------------------------------------------------------------");


    }
    
}
