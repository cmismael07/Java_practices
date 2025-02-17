import java.util.Scanner;

public class valorDentroRango {
    public static void main(String[] args) {
        System.out.println("*** Valor dentro rango***");
        final var MINIMO = 0;
        final var MAXIMO = 5;
        //Solicitamos un valor entre 0 y 5
        System.out.print("proporciona un valor entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        //verificar si el dato está dentro del rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO;
        System.out.println("estaDentroRango? = " + estaDentroRango);
    }
}
