/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio;

/**
 *
 * @author PRV
 */
public class RegistroVenta {

    private double Venta1;
    private double Venta2;
    private double Venta3;

    public RegistroVenta(double xventa1, double xventa2, double xventa3) {
        this.Venta1 = xventa1;
        this.Venta2 = xventa2;
        this.Venta3 = xventa3;
    }

    public double Total() {
        return (this.Venta1 + this.Venta2 + this.Venta3);
    }

    public double Promedio() {
        return ((this.Venta1 + this.Venta2 + this.Venta3) / 3);
    }

    public double Mayor() {
        double xmayor;
        xmayor = this.Venta1;
        if (this.Venta2 > xmayor) {
            xmayor = this.Venta2;
        }
        if (this.Venta3 > xmayor) {
            xmayor = this.Venta3;
        }
        return (xmayor);

    }

    public double Menor() {
        double xmenor;
        xmenor = this.Venta1;
        if (this.Venta2 < xmenor) {
            xmenor = this.Venta2;
        }
        if (this.Venta3 < xmenor) {
            xmenor = this.Venta3;
        }
        return (xmenor);
    }
}
