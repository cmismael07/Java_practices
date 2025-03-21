import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación ticket de venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio de producto 1: ");
        var precioProducto1 = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de producto 2: ");
        var precioProducto2 = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de producto 3: ");
        var precioProducto3 = Double.parseDouble(consola.nextLine());

        System.out.print("Precio de producto 4: ");
        var precioProducto4 = Double.parseDouble(consola.nextLine());

        System.out.print("¿Aplicar algún descuento? (%): ");
        var descuentoProcentaje = Integer.parseInt(consola.nextLine());

        //Cálculo del subtotal (sin impuestos)
        var subtotal = precioProducto1 + precioProducto2 + precioProducto3 + precioProducto4;

        //Aplicar descuento
        var descuento = subtotal * (descuentoProcentaje/100.0);

        //Subtotal con descuento
        var subtotalConDescuento = subtotal - descuento;

        //Cálculo de los impuestos (16%)
        var impuesto = subtotalConDescuento * 0.16;

        //Cálculo total (incluyendo impuestos)
        var costoTotal = subtotalConDescuento + impuesto;

        //Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                -----------------
                Subtotal: $%.2f
                Descuento; $%.2f (%d%%)
                Impuesto(16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal, descuento, descuentoProcentaje, impuesto, costoTotal);



    }
}
