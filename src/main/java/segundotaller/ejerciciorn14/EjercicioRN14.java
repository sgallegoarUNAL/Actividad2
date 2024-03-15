package segundotaller.ejerciciorn14;

import java.util.Scanner;

public class EjercicioRN14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las ventas del departamento 1 (VD1):");
        double VD1 = entrada.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 2 (VD2):");
        double VD2 = entrada.nextDouble();
        
        System.out.println("Ingrese las ventas del departamento 3 (VD3):");
        double VD3 = entrada.nextDouble();
        
        System.out.println("Ingrese el salario (SALAR):");
        double SALAR = entrada.nextDouble();
        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;
        double SALAR1, SALAR2, SALAR3;
        
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;}
        else {
            SALAR1 = SALAR;}
        
        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;}
        else {
            SALAR2 = SALAR;}
        
        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;}
        else {
            SALAR3 = SALAR;}
        System.out.println("Salario vendedores departamento 1: " + SALAR1);
        System.out.println("Salario vendedores departamento 2: " + SALAR2);
        System.out.println("Salario vendedores departamento 3: " + SALAR3);
    }
}