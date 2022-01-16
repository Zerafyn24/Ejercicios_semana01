/* EJERCICIO PROPUESTO :
 * El papá de María desea saber cuánto será el pago total que deberá realizar a fin de mes por
 * concepto de servicios de su casa(agua, luz, cable, internet, teléfono), siendo los siguientes
 * montos:
 *
 * Servicio  Monto a Pagar Mensual
 * Agua      S/. 90.00 soles
 * Luz       S/. 65.00 soles
 * Cable     S/. 45.00 soles
 * Internet  S/. 90.00 soles
 * Teléfono  S/. 45.00 soles
 * 
 * Realizar un programa que permita obtener el monto total a pagar por concepto de
 * servicios
 */
package ejercicios_semana01;


public class Ejercicio04 {

    
    public static void main(String[] args) {
        double agua = 90, luz = 65, cable = 45, internet = 90, telefono = 45, total;
        
        total = agua + luz + cable + internet + telefono;
        
        System.out.println("El monto total a pagar es de: "+ total + " soles");
    }
    
}
