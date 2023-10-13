/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 * CLASE PRINCIPAL PROFESOR - 
 *  nos guarda los datos de las demas clases 
 * 
 */
public class Profesor{
  /**
  * Nuestros atributos
  * nombre, titulo, materia seran de tipo string
  * edad sera de tipo primitivo entero
  * dificil de tipo booleano
  */
  String nombre;
  String titulo;
  String materia;
  int edad;
  boolean dificil;

     /**
     * Construcutor vacio
     */
  public Profesor(){
  }
    /**
     * CONSTRUCTOR LLENO DE PROFESOR - Recibe CINCO parametros
     * nombre, titulo, materia seran del profesor de tipo string
     * edad sera del profesor de  tipo primitivo entero
     * dificil de tipo booleano
     */
  public Profesor(String nombre, String titulo, String materia, int edad, boolean dificil){
    this.nombre = nombre;
    this.titulo = titulo;
    this.materia = materia;
    this.edad = edad;
    this.dificil = dificil;
  }
     /**
     *  --------- METODOS OBJETIVOS -----    
     */

  public void darClase(boolean clase){
    if (clase){
      System.out.println("Soy "+nombre+" y estoy dando clase de "+materia);
    }else{
      System.out.println("No estoy dando clase de "+materia);
    }
  }

  public void horas(int horas){
    System.out.println("Soy el profesor y he dado "+horas+" horas de clase");
  }

  public void calificando(String calificando){
    System.out.println("Estoy calificando "+calificando);
  }

  public void escribir(){
    System.out.println("Estoy escribiendo en el pizarron");
  }

  public void calificacion(float promedio){
    System.out.println("El promedio de mi clase de "+materia+" fue "+promedio);
  }
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */
  @Override
  public String toString(){
    return "Profesor{"+"nombre="+nombre+" titulo="+titulo+" materia ="+materia+" edad ="
            +edad+" dificultad="+dificil+"}";
  }
}