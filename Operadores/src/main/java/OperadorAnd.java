public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador AND ***");
        boolean a = true, b = false;
        //and (Regresa true solo si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
    }
}
