import java.util.Scanner;


public class PrecioProducto {

	public static void main (String[]  Args){
		
		Scanner teclado = new Scanner(System.in);
		
		int precio;
		int cantidad;
		int total;
		
		System.out.println("Ingrese el valor del articulo: ");
		precio = teclado.nextInt();
		System.out.println("Ingrese la cantidad de articulos: ");
		cantidad = teclado.nextInt();
		
		total = cantidad*precio;
		
		System.out.println("El total a pagar es de: " + total + " colones");
	}
}
