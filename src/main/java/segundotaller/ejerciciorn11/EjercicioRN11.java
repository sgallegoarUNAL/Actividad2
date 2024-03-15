package segundotaller.ejerciciorn11;

import java.util.Scanner;

public class EjercicioRN11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero (N1):");
        int N1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero (N2):");
        int N2 = entrada.nextInt();
        
        System.out.println("Ingrese el tercer numero (N3):");
        int N3 = entrada.nextInt();
        
        int MAYOR;
        
        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;}
        else {
            if (N2 > N3) {
                MAYOR = N2;}
            else {
                MAYOR = N3;}
        }
        System.out.println("El valor mayor entre " + N1 + ", " + N2 + " y " + N3 + " es: " + MAYOR);
    }
}