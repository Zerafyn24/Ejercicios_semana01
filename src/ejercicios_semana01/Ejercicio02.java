/* EJERCICIO PROPUESTO :
 * Desarrollar un programa que calcule las raíces de la ecuación cuadrática
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio02 {
  
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double result, num;
        
        System.out.println("Ingresa un numero");
        num = scan.nextDouble();
        
        result = Math.sqrt(num);
        
        System.out.println("La raiz cuadrada de "+ num +" es: "+result);
    }
    
}
