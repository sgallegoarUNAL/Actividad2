package segundotaller.ejerciciopn22;

import java.util.Scanner;

public class EjercicioPN22 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese el salario por hora:");
        double salario = entrada.nextDouble();
        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        int horas = entrada.nextInt();
        
        double salarioMensual = salario * horas;
        
        if (salarioMensual > 450000) {
            System.out.println("Nombre: " + nombre);
            System.out.println("Salario: $" + salarioMensual);}
        else {
            System.out.println("Nombre: " + nombre);
        }
    }
}
