package segundotaller.ejerciciopn24;

import java.util.Scanner;

public class EjercicioPN24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A:");
        double A = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        double B = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        double C = entrada.nextDouble();
        
        if (A > B && A > C) {
            System.out.println("La esfera A es la de mayor peso.");}
        else if (B > A && B > C) {
            System.out.println("La esfera B es la de mayor peso.");}
        else if (C > A && C > B) {
            System.out.println("La esfera C es la de mayor peso.");}
    }
}