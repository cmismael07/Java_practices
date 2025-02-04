import java.util.Random;
import java.util.Scanner;

public class GeneradorId {
    public static void main(String[] args) {
        System.out.println("*** Sistema Generador de ID Único ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        //Solicitar nombre
        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();

        //Solicitar apellido
        System.out.print("Ingresa tu apellido: ");
        var apellido = consola.nextLine();

        //Solicitar año de nacimiento
        System.out.print("Ingresa tu año de nacimiento(YYYY): ");
        var anioNacimiento = consola.nextLine();


        //Normalizar valores
        var nombreNormalizado = nombre.trim().toUpperCase().substring(0, 2);
        var apellidoNormalizado = apellido.trim().toUpperCase().substring(0, 2);
        var anioNormalizado = anioNacimiento.trim().substring(2);

        //Generar valor aleatorio
        var numeroRandom = random.nextInt(9999)+1;

        //Formato de 4 digitos
        var numeroRandomFormato = String.format("%04d",numeroRandom);

        //Generar el ID Único
        var idGenerado = new StringBuilder();
        idGenerado.append(nombreNormalizado);
        idGenerado.append(apellidoNormalizado);
        idGenerado.append(anioNormalizado);
        idGenerado.append(numeroRandomFormato);
        System.out.printf("""
                %nHola %s
                \tTu nuevo número de identificación (ID) generado por el sistema es:\s
                \t%s\s
                \tFelicidades!
                """, nombre, idGenerado);



    }
}
