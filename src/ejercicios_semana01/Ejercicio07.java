/*
 * Desarrollar un programa que convierta grados centígrados a grados Fahrenheit, grados
 * kelvin y grados rankine. El algoritmo debe mostrar los grados centígrados y las conversiones
 * obtenidas.
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double centigrados, fahrenheit, kelvin, rankine;
        
        System.out.println("Ingresa los grados centigrados para hacer la conversion");
        centigrados = scan.nextDouble();
        
        fahrenheit = (centigrados * 9/5) + 32;
        kelvin = centigrados + 273.15;
        rankine = (centigrados * 9/5) + 491.67;
        
        System.out.println("\nCONVERSION: ");
        System.out.println(centigrados+"°C equivale a: ");
        System.out.println(fahrenheit+ " fahrenheit");
        System.out.println(kelvin+ " kelvin");
        System.out.println(rankine+ " rankine");
    }
    
}
