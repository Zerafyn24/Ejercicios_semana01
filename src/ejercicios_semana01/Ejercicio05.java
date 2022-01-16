/* EJERCICIO PROPUESTO :
 * Un padre repartirá una cantidad de dinero entre sus cinco hijos. Cada uno recibirá una
 * cantidad equivalente a:
      Tamara: 85% del monto recibido por Josué
      Josué: 27% de la cantidad a repartir
      Caleb: 23% del monto total recibido entre Josué y Daniel
      Daniel: 25% de la cantidad a repartir
      David: lo que queda del dinero a repartir
 * Dada la cantidad de dinero a repartir, desarrolle un programa que determine cuánto de
 * dinero recibirá cada hijo.
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio05 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double Tamara, Josue, Caleb, Daniel, David, herencia;
        
        System.out.println("Ingrese el monto que repartira el padre");
        herencia = scan.nextDouble();
        
        Josue = 0.27 * herencia;
        Daniel = 0.25 * herencia;
        Tamara = 0.85 * Josue;
        Caleb = 0.23 * (Josue + Daniel);
        David = herencia - (Josue + Daniel + Tamara + Caleb);
        
        System.out.println("\n");
        System.out.println(" Asi se repartira el dinero");
        System.out.println("Tamara : "+ Tamara);
        System.out.println("Josue : "+ Josue);
        System.out.println("Caleb : "+ Caleb);
        System.out.println("Daniel : "+ Daniel);
        System.out.println("David : "+ David);
    }
    
}
