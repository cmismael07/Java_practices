import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("***Sistema de Empleados***");

        var consola = new Scanner(System.in);

        //Nombre del empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();
        //System.out.println("nombreEmpleado = " + nombreEmpleado);

        //Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());
        //System.out.println("edadEmpleado = " + edadEmpleado);

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());
        //System.out.println("salarioEmpleado = " + salarioEmpleado);
        
        //Es jefe de departamento
        System.out.print("Es jefe de departamento(true/false)?: ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());
        //System.out.println("esJefeDepartamento = " + esJefeDepartamento);

        //Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado: ");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tedad: " + edadEmpleado + " años");
        //System.out.println("\tSalario: " + salarioEmpleado);
        System.out.printf("\tSalario: $%.2f%n", salarioEmpleado);
        System.out.println("\tEs jefe de departamento?: " + esJefeDepartamento);


    }
}
