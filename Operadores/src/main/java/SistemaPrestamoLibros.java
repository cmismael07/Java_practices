import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("***Sistema de Préstamo de libros***");
        final var DISTANCIA_PERMITIDA_KM = 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Cuentas con credencial de estudiante?(true/false): ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuántos KM vives de la biblioteca?: ");
        var distanciaBiblioteca = Integer.parseInt(consola.nextLine());

        var esElegiblePrestamo = tienesCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
        System.out.println("esElegiblePrestamo = " + esElegiblePrestamo);
    }
}
