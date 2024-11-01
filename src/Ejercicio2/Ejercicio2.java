package Ejercicio2;
import Ejercicio2.RegistroSueldo;
import java.util.Scanner;

public class Ejercicio2 {
     public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        double sueldo1, sueldo2, sueldo3,sueldo4;
        //Entrada
        System.out.print("Ingresa sueldo 1 :");
        sueldo1 = lectura.nextDouble();
        System.out.print("Ingresa sueldo 2 :");
        sueldo2 = lectura.nextDouble();
        System.out.print("Ingresa sueldo 3 :");
        sueldo3 = lectura.nextDouble();
        System.out.print("Ingresa sueldo 4 :");
        sueldo4 = lectura.nextDouble();

        RegistroSueldo objregSueldo = new RegistroSueldo(sueldo1,sueldo2, sueldo3, sueldo4);
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Total de ventas : " + objregSueldo.Total());
        System.out.println("Promedio de ventas : " + objregSueldo.Promedio());
        System.out.println("Mayor de ventas : " + objregSueldo.Mayor());
        System.out.println("Menor de ventas : " + objregSueldo.Menor());
    }
 
}
