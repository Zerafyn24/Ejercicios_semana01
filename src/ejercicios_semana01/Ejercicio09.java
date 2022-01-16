/*
 * El área de Recursos Humanos de la Empresa Ave Fénix SAC, desea obtener el pago total de
 * un obrero, siendo su pago equivalente al número de horas trabajadas por el costo hora,
 * encontrar el pago total del obrero para la generación del cheque respectivo.
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double horasTrabajado, pagoHoras, total;
        
        System.out.print("Ingresa las horas trabajadas ");
        horasTrabajado = scan.nextDouble();
        System.out.print("Ingresa el monto que gana por horas ");
        pagoHoras = scan.nextDouble();
        
        total = horasTrabajado * pagoHoras;
        
        System.out.println("El cheque para el obrero debe de ser por "+total+" soles");
    }
    
}
