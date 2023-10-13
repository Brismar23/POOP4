/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop4;

/**
 *CLASE PRINCIPAL TRIANGULORECTANGULOA -nos guarda los datos de las demas clases 
 * 
 */
public class TrianguloRectangulo {
    /**
     * Nuestros atributos
     * variables de tipo float base y altura
     */
    float base;
    float altura;
    
    
    /**
     * Construcutor vacio
     */
    public TrianguloRectangulo() {
    }
    
    /**
     * CONSTRUCTOR LLENO DE TruanguloRectangulo - Recibe DOS parametros
     * base, altura seran de TruanguloRectangulo en flotante
     */

    public TrianguloRectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * METODOS OBJETIVOS
     */
    public void calcularHipotenusa(float calcularHipotenusa){
        System.out.println("Insertta el valor: "+calcularHipotenusa);
    }
    
    public void calcularArea(float calcularArea){
        System.out.println("Inserta el valor: "+ calcularArea);
    }
    
    public void calcularPerimetro(float calcularPerimetro){
        System.out.println("El perimetro es: "+ calcularPerimetro);
    }
    /**
     * ------METODOS DE SOBREESCRITURA -----------
     * Metodo toString - que muestra los valores de los atributos
     * @return - regresa la concatenacion de los valores de los atributos    
     */

    @Override
    public String toString() {
        return "TrianguloRectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
}
