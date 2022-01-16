/* EJERCICIO PROPUESTO :
 * Desarrollar un programa que calcule el área de un círculo 
 */

package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio01 {
 
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
        int radio;
        double circunferencia, area, volumen;
        final double PI = 3.1416;
        
        System.out.println("Ingresa el radio del circulo");
        radio = scan.nextInt();
        
        circunferencia = (2 * PI) * radio;
        area = PI * Math.pow(radio , 2);
        volumen = (4/3 * PI) * Math.pow(radio , 3);
        
        System.out.println("Circunferencia: "+ circunferencia);
        System.out.println("area: "+ area);
        System.out.println("volumen: "+ volumen);
    }
    
}
