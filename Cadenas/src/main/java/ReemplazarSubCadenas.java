public class ReemplazarSubCadenas {
    public static void main(String[] args) {
        //Reemplazar subcadenas
        var cadena = "Hola Mundo";
        System.out.println("cadena original = " + cadena);

        //Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        //Reemplazar "Hola" por "Adios"
        nuevaCadena = cadena.replace("Hola", "saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
