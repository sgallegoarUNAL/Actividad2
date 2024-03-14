package segundotaller.ejerciciopn19;

import java.util.Scanner;

public class EjercicioPN19 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado,area,altura,perimetro;
        System.out.println("Ingrese el valor del lado del triangulo equilatero");
        lado = entrada.nextDouble();
        
        Triangulo_Eq triangulo = new Triangulo_Eq(lado);
        
        area = triangulo.calcularArea();
        perimetro = triangulo.calcularPerimetro();
        altura = triangulo.calcularAltura();
        
        System.out.println("El area del triangulo equilatero es: " + area);
        System.out.println("El perimetro del triangulo equilatero es: " + perimetro);
        System.out.println("La altura del triangulo equilatero es: " + altura);
    }
}