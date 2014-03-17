import java.util.Scanner;


public class SumaProducto {
	
	public static void main (String[] args){
		
		Scanner teclado = new Scanner (System.in);
		int numero1;
		int numero2;
		int suma;
		int producto;
		
		System.out.println("Ingrese el primer numero");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero");
		numero2 = teclado.nextInt();
		suma = numero1 + numero2;
		producto = numero1*numero2;
		
		System.out.print("La suma de los dos numeros es: ");
		System.out.println(suma);
		System.out.print("El producto de los dos numeros es: ");
		System.out.print(producto);
		
		
		
	}

}
