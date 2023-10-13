/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * CLASE PRINCIPAL COCHE - nos guarda los datos de las demas clases 
 * 
 */
public class Coche {
    /**
      * Nuestros atributos private 
      * Nuestras variables marca, modelo, color, combustible y motor seran de tipo String 
      */
    String marca, modelo,color, combustible, motor;
    
    /**
     * Construcutor vacio
     */
    public Coche() {
    }
    /**
     * CONSTRUCTOR LLENO DE COCHE - Recibe CINCO parametros
     * marca, modelo, color,combustible y motor del coche en String
     */
    public Coche(String marca, String modelo, String color, String combustible, String motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.combustible = combustible;
        this.motor = motor;
    }
    /**
     *  --------- METODOS OBJETIVOS -----    
     * r
     */
    public void avanzar(){
        System.out.println("Avanzo el coche");
    }
    
    public void detener(){
        System.out.println("Detener el coche");
    }
    
    public void encender(){
        System.out.println("Encender el coche");
    }
    
    public void apagar(){
        System.out.println("Apagar el coche");
    }
    
    public void girar(String lado){
        System.out.println("Girar el coche a la "+ lado);
    }
    
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */

    @Override
    public String toString() { //nos forma una cadena
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", combustible=" + combustible + ", motor=" + motor + '}';
    }
    
}
