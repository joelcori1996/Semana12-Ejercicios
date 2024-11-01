package Ejercicio2;
public class RegistroSueldo {
    private double Sueldo1;
    private double Sueldo2;
    private double Sueldo3;
    private double Sueldo4;

    public RegistroSueldo(double xsueldo1, double xsueldo2, double xsueldo3, double xsueldo4) {
        this.Sueldo1 = xsueldo1;
        this.Sueldo2 = xsueldo2;
        this.Sueldo3 = xsueldo3;
        this.Sueldo4 = xsueldo4;
    }

    public double Total() {
        return (this.Sueldo1 + this.Sueldo2 + this.Sueldo3 + this.Sueldo4);
    }

    public double Promedio() {
        return ((this.Sueldo1 + this.Sueldo2 + this.Sueldo3 + this.Sueldo4) / 4);
    }

    public double Mayor() {
        double xmayor;
        xmayor = this.Sueldo1;
        if (this.Sueldo2 > xmayor) {
            xmayor = this.Sueldo2;
        }
        if (this.Sueldo3 > xmayor) {
            xmayor = this.Sueldo3;
        }
        if (this.Sueldo4 > xmayor) {
            xmayor = this.Sueldo4;
        }
        return (xmayor);
    }
    public double Menor() {
        double xmenor;
        xmenor = this.Sueldo1;
        if (this.Sueldo2 < xmenor) {
            xmenor = this.Sueldo2;
        }
        if (this.Sueldo3 < xmenor) {
            xmenor = this.Sueldo3;
        }
        if (this.Sueldo4 < xmenor) {
            xmenor = this.Sueldo4;
        }
        return (xmenor);
    }
}
