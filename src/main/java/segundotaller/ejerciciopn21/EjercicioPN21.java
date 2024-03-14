package segundotaller.ejerciciopn21;

import java.util.Scanner;

public class EjercicioPN21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c;
        
        System.out.println("Ingrese el valor del lado A");
        a = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado B");
        b = entrada.nextDouble();
        System.out.println("Ingrese el valor del lado C");
        c = entrada.nextDouble();
        
        Triangulo triangulo = new Triangulo(a,b,c);
        System.out.println("Perimetro de dicho triangulo: " + triangulo.calcularPerimetro());
        System.out.println("Semiperimetro de dicho triangulo: " + triangulo.calcularSemi());
        System.out.println("Area de dicho triangulo: " + triangulo.calcularArea());
    }
}
