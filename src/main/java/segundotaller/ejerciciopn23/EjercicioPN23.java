package segundotaller.ejerciciopn23;

import java.util.Scanner;

public class EjercicioPN23 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de A:");
        double A = entrada.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double B = entrada.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double C = entrada.nextDouble();
        
        double discriminante = (B * B)-(4 * A * C);
        
        if (discriminante > 0) {
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);}
        else if (discriminante == 0) {
            double x = -B / (2 * A);
            System.out.println("La solución es:");
            System.out.println("x = " + x);}
        else {
            System.out.println("La ecuación no tiene soluciones reales.");}
    }
}

