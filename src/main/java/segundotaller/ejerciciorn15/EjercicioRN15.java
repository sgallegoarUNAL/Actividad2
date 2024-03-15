package segundotaller.ejerciciorn15;

import java.util.Scanner;

public class EjercicioRN15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el peso de la esfera A (PESOA):");
        double PESOA = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera B (PESOB):");
        double PESOB = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera C (PESOC):");
        double PESOC = entrada.nextDouble();
        System.out.println("Ingrese el peso de la esfera D (PESOD):");
        double PESOD = entrada.nextDouble();
        
        if (PESOA == PESOB && PESOA == PESOC) {
            System.out.println("La esfera D es la diferente");
            if (PESOD > PESOA) {
                System.out.println("Y es de mayor peso");}
            else {
                System.out.println("Y es de menor peso");}
        }
        else if (PESOA == PESOB && PESOA == PESOD) {
            System.out.println("La esfera C es la diferente");
            if (PESOC > PESOA) {
                System.out.println("Y es de mayor peso");}
            else {
                System.out.println("Y es de menor peso");}
        }
        else if (PESOA == PESOC && PESOA == PESOD) {
            System.out.println("La esfera B es la diferente");
            if (PESOB > PESOD) {
                System.out.println("Y es de mayor peso");}
            else {
                System.out.println("Y es de menor peso");}
        }
        else {
            System.out.println("La esfera A es la diferente");
            if (PESOA > PESOB) {
                System.out.println("Y es de mayor peso");}
            else {
                System.out.println("Y es de menor peso");}
        }
    }
}