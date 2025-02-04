public class busquedaSubCadenas {
    public static void main(String[] args) {
        //Buscar subcadenas
        //indexOf - Devuelve el índice de la primera aparición de la subcadena
         var cadena1 = "Hola Mundo";
         
         var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);
        
        //lastindexof - Devuelve el índice de la última aparición de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        
        //Subcadena no encontrada devuelve -1
        var indice3= cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " + indice3);
    }
}
