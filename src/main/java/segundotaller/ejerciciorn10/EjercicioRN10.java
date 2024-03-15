package segundotaller.ejerciciorn10;

import java.util.Scanner;

public class EjercicioRN10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de inscripcion (NI):");
        int NI = entrada.nextInt();
        
        System.out.println("Ingrese el nombre del estudiante (NOM):");
        String NOM = entrada.next();
        
        System.out.println("Ingrese el patrimonio del estudiante (PAT):");
        double PAT = entrada.nextDouble();
        
        System.out.println("Ingrese el estrato del estudiante (ES):");
        int ES = entrada.nextInt();
        
        double PAGMAT = 50000;
        
        if (PAT > 2000000 && ES > 3) {
            PAGMAT = PAGMAT + 0.03 * PAT;
        }
        
        System.out.println("El estudiante con numero de inscripcion " + NI + " y nombre " + NOM + " debe pagar: $" + PAGMAT);

    }
}
