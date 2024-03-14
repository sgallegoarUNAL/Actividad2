package segundotaller.ejerciciopn18;

import java.util.Scanner;

public class EjercicioPN18 {
    public static void main(String[] args) {
        int codigo;
        String nombre;
        double horas_trabajo, razon_hora, retencion, s_bruto, s_neto, p_retencion;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el codigo del empleado: ");
        codigo = entrada.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = entrada.next();
        System.out.println("Ingrese la razon por hora del empleado: ");
        razon_hora = entrada.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas del empleado: ");
        horas_trabajo = entrada.nextDouble();
        System.out.println("Ingrese el porcentaje de retención: ");
        p_retencion = entrada.nextDouble();
        
        s_bruto = horas_trabajo * razon_hora;
        retencion = s_bruto * (p_retencion/100);
        s_neto = s_bruto - retencion;
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario bruto: " + s_bruto);
        System.out.println("Salario neto: " + s_neto);
    }
}
