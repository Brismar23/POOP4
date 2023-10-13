/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * CLASE PRINCIPAL - PERRO nos guarda los datos de las demas clases 
 * 
 */
public class Perro {
    /**
      * Nuestros atributos
      * nombre, raza, color seran de tipo string
      * edad sera de tipo primitivo entero
      */
    String nombre, raza, color;
    int edad;
    
    /**
     * Construcutor vacio
     */
    public Perro() {
    }
    /**
     * CONSTRUCTOR LLENO DE PERRO - Recibe CUATRO parametros
     * nombre, raza, color del perro en String
     * edad del perro en entero
     */
    public Perro(String nombre, String raza, String color, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
    }    
    /**
     *  --------- METODOS OBJETIVOS -----    
     */
    public void sentado(){
        System.out.println("Estoy sentado");
    }
      
    public void ladra(int veces){
        for (int i = 0; i<veces; i++){
             System.out.println("Guaa...Guaa...");
        }    
    }

    public void corre(int distancia){
        System.out.println("Corre"+ distancia + "metros");
    }
    
    public void duerme(int horas){
        System.out.println("duerme"+ horas + "horas");

    }
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", color=" + color +
                ", edad=" + edad + '}';
    }   
}
