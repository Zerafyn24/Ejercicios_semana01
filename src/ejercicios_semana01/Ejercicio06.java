/* EJERCICIO PROPUESTO :
 * La municipalidad de Pueblo Libre piensa invertir cierto monto de dinero en la reparación de
 * las pistas en las avenidas principales. Cada avenida recibirá un monto equivalente a:
 * 
 *  Av. La Mar: 35% del monto recibido por Av. Bolivar
 *  Av. 28 de Julio: 25% del monto recibido
 *  Av. Bolivar: 10% de lo recibido por la Av. 28 de Julio y Av. Clement
 *  Av. Clement: 15% del monto recibido
 *  Av. Sucre: lo que queda del resto.
 *
 * Dado el monto a invertir, desarrolle un programa que determine cuánto dinero le
 * corresponde a cada avenida.
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double laMar, AV28DeJulio, bolivar, clement, sucre, inversion;
        
        System.out.println("Ingresa el monto total de la inversion");
        inversion = scan.nextDouble();
        
        AV28DeJulio = 0.28 * inversion;
        clement = 0.15 * inversion;
        bolivar = 0.10 * (AV28DeJulio + clement);
        laMar = 0.35 * bolivar;
        sucre = inversion -(AV28DeJulio + clement + bolivar + laMar);
        
        System.out.println("el monto a invertir por cada avenida es: ");
        System.out.printf("Av. La Mar: %.2f %n", laMar);
        System.out.printf("Av. 28 de Julio: %.2f %n", AV28DeJulio);
        System.out.printf("Av. Bolivar: %.2f %n", bolivar);
        System.out.printf("Av. Clement: %.2f %n", clement);
        System.out.printf("Av. Sucre: %.2f %n", sucre);
    }
    
}
