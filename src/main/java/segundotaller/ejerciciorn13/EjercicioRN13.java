package segundotaller.ejerciciorn13;

import java.util.Scanner;

public class EjercicioRN13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor de la compra (VALCOMP):");
        double VALCOMP = entrada.nextDouble();
        
        System.out.println("Ingrese el color de la bolita (COLOR):");
        String COLOR = entrada.next();
        
        double PDES;
        
        if (COLOR.equals("BLANCO")) {
            PDES = 0;}
        else if (COLOR.equals("VERDE")) {
            PDES = 10;}
        else if (COLOR.equals("AMARILLO")) {
            PDES = 25;}
        else if (COLOR.equals("AZUL")) {
            PDES = 50;}
        else {
            PDES = 100;}
        
        double VALPAG = VALCOMP - (PDES * VALCOMP / 100);
        
        System.out.println("El cliente debe pagar: $" + VALPAG);
    }
}

