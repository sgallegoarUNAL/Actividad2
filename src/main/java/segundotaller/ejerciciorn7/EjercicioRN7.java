package segundotaller.ejerciciorn7;

import java.util.Scanner;

public class EjercicioRN7 {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
        
    System.out.println("Ingrese el valor de A:");
    int A = entrada.nextInt();
        
    System.out.println("Ingrese el valor de B:");
    int B = entrada.nextInt();
        
    if (A > B) {
        System.out.println("A ES MAYOR QUE B");}
    else if (A == B) {
        System.out.println("A ES IGUAL A B");}
    else {
        System.out.println("A ES MENOR QUE B");}
    }
}