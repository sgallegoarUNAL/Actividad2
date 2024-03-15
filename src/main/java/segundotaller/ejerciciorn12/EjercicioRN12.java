package segundotaller.ejerciciorn12;

import java.util.Scanner;

public class EjercicioRN12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del trabajador (NOM):");
        String NOM = entrada.nextLine();
        
        System.out.println("Ingrese el numero de horas trabajadas (NHT):");
        int NHT = entrada.nextInt();
        
        System.out.println("Ingrese el valor por hora (VHN):");
        double VHN = entrada.nextDouble();
        
        double SALARIO;
        
        if (NHT > 40) {
            int HET = NHT - 40;
            if (HET > 8) {
                int HEE8 = HET - 8;
                SALARIO = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;}
            else {
                SALARIO = 40 * VHN + HET * 2 * VHN;}
        }
        else {
            SALARIO = NHT * VHN;}
        System.out.println("El trabajador " + NOM + " devengo: $" + SALARIO);
    }
}