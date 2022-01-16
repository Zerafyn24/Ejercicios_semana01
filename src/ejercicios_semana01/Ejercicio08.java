/*
 * Desarrollar un programa que calcule el área de un Rombo. Ingresar las diagonales. El
 * algoritmo debe imprimir el valor de las diagonales y del área.
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double diagonal1, diagonal2, area;
        
        System.out.print("Ingresa el diagonal 1 del rombo");
        diagonal1 = scan.nextDouble();
        System.out.print("Ingresa el diagonal 2 del rombo");
        diagonal2 = scan.nextDouble();
        
        area = (diagonal1 * diagonal2) / 2;
        
        System.out.println("\nDiagonal 1: "+ diagonal1);
        System.out.println("Diagonal 2: "+ diagonal2);
        System.out.println("el area del rombo es: "+ area);
    }
    
}
