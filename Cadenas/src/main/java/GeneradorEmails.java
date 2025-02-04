public class GeneradorEmails {
    public static void main(String[] args) {
        System.out.println("*** Generador de Emails ***");
        var nombreUsuario = "Ismael Cangá Mina";
        System.out.println("nombreUsuario = " + nombreUsuario);

        //Procesar o normalizar el nombre del usuario
        //Limpiar los espacioes en blanco al inicio y al final

        var usuarioNormalizado =nombreUsuario.strip();
        //Reemplazar los espacios en blanco por un punto
        usuarioNormalizado = usuarioNormalizado.replace(" ",".");
        //convertir a minúsculas
        usuarioNormalizado = usuarioNormalizado.toLowerCase();
        System.out.println("usuarioNormalizado = " + usuarioNormalizado);
        var nombreEmpresa = " Global Mentoring ";
        System.out.println("\nNombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.ec";
        System.out.println("extensionDominio = " + extensionDominio);
        
        //Quitamos los espacios en blanco y convertimos a minusculas
        var empresaNormalizada = nombreEmpresa.strip().replace(" ",".").toLowerCase();
         var dominioNormalizado = "@" + empresaNormalizada + extensionDominio;
        System.out.println("dominioNormalizado = " + dominioNormalizado);
        //EMAIL finalizado
        var emailFinalizado = usuarioNormalizado + dominioNormalizado;
        System.out.println("emailFinalizado = " + emailFinalizado);
    }
}
