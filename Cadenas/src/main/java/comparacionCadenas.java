public class comparacionCadenas {
    public static void main(String[] args) {
        //Comparación de cadenas (pool de cadenas)
        var cadena1 ="Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //Comparación de cadenas(==) comparan la referencia
        System.out.print("Cadena1 es igual en referencia a la cadena2: ");
        System.out.println(cadena1 == cadena2);
        System.out.print("Cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1 == cadena3);
        //Comparar contenido con el método equals
        System.out.print("Cadena1 es igual que cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
