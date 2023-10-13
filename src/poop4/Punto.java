/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *CLASE PRINCIPAL PUNTO -nos guarda los datos de las demas clases 
 * 
 */


/**Para hacer la clase Punto, seleccionamos nuestro paquete "poop4", damos
clic derecho y creamos la clase llamada Punto*/
public class Punto {
    /**
     * Nuestros atributos
     * variables de tipo entero
     */
    int x,y; 

    /**
     * Construcutor vacio
     */
    public Punto() {
    }
    
    /**
     * CONSTRUCTOR LLENO DE PUNTO - Recibe DOS parametros
     * X, Y seran de Punto en entero
     */

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    /**
     * METODOS OBJETIVOS
     */
    public void imprimirPunto(){
        System.out.println("x=" +x+ "y=" +y);
    }
    
    
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */

    @Override // Anotacion - es para la programacion
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }  
}
