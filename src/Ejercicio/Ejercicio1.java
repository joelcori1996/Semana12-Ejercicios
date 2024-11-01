/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        double vt1, vt2, vt3;
        //Entrada
        System.out.print("Ingresa venta 1 :");
        vt1 = lectura.nextDouble();
        System.out.print("Ingresa venta 2 :");
        vt2 = lectura.nextDouble();
        System.out.print("Ingresa venta 3 :");
        vt3 = lectura.nextDouble();

        RegistroVenta objregventa = new RegistroVenta(vt1, vt2, vt3);
        System.out.println("");
        System.out.println("Resultados");
        System.out.println("Total de ventas : " + objregventa.Total());
        System.out.println("Promedio de ventas : " + objregventa.Promedio());
        System.out.println("Mayor de ventas : " + objregventa.Mayor());
        System.out.println("Menor de ventas : " + objregventa.Menor());
    }

}
