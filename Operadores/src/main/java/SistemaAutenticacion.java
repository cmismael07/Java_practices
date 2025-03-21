import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Autenticación ***");
        var consola = new Scanner(System.in);
        final var USUARIO_VALIDO = "isma";
        final var CONTRASENA_VALIDO = "1234";
        System.out.print("¿Cuál es tu usuario?: ");
        var usuario = consola.nextLine();
        System.out.print("¿Cuál es tu Contraseña?: ");
        var contrasena = consola.nextLine();
        var datosSonCorrectos = usuario.equals(USUARIO_VALIDO) && contrasena.equals(CONTRASENA_VALIDO);
        System.out.println("¿Los datos son correctos?: = " + datosSonCorrectos);

    }
}
