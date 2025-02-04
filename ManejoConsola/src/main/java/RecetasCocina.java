import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        System.out.println("***Receta de Cocina***");
        var consola = new Scanner(System.in);

        System.out.print("Nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        System.out.print("Ingredientes principales: ");
        var ingredientesReceta = consola.nextLine();

        System.out.print("Tiempo de preparación(minutos): ");
        var tiempoPreparacion = Double.parseDouble(consola.nextLine());

        System.out.print("Dificultad (Fácil, Media o Alta): ");
        var dificultadReceta = consola.nextLine();

        System.out.println("\n--- Datos de la receta --- ");
        System.out.println("\tNombre de la Receta: " + nombreReceta);
        System.out.println("\tIngredientes principales: " + ingredientesReceta);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultadReceta);

    }
}
