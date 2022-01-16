/* EJERCICIO PROPUESTO :
 * El Empresa Makro S.A, desea obtener el impuesto general a las ventas (IGV) de la venta
 * total realizada, proceder a realizar un programa que permita obtener el IGV de una venta
 * total
 */
package ejercicios_semana01;

import java.util.Scanner;


public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        final double IGV = 0.18;
        double ventaTotal, impuestoIGV;
        
        System.out.println("Ingresa la venta total");
        ventaTotal = scan.nextDouble();
        
        impuestoIGV = ventaTotal * IGV;
        
        System.out.println("El total a pagar es: "+ impuestoIGV);
    }
    
}
