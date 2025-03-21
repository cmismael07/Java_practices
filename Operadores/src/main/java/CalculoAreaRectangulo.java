import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***Calcular el área de un rectángulo***");
        var consola = new Scanner(System.in);
        System.out.print("Proporciona la base: ");
        var base = Double.parseDouble(consola.nextLine());
        System.out.print("Proporciona la altura: ");
        var altura = Double.parseDouble(consola.nextLine());
        final var AREA = base * altura;
        final var PERIMETRO = 2*(base+altura);
        System.out.println("AREA = " + AREA);
        System.out.println("PERIMETRO = " + PERIMETRO);
    }
}
