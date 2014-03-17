import java.util.Scanner;

// Se ingresan 4 numeros, calcula e imprime la suma de los dos primeros y el producto del 3 y4

public class IngresarCuatroNumeros {

	public static void main (String[] Args){
		Scanner teclado =new Scanner(System.in);
		
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		int suma;
		int producto;
		
		System.out.println("Ingrese el primer numero: ");
		numero1 = teclado.nextInt();
		System.out.println("Ingrese el segundo Numero: ");
		numero2 = teclado.nextInt();
		System.out.println("Ingrese el tercer Numero: ");
		numero3 = teclado.nextInt();
		System.out.println("Ingrese el cuarto Numero: ");
		numero4 = teclado.nextInt();
		
		suma = numero1 + numero2;
		producto = numero3*numero4;
		
		System.out.println("La suma de los dos primeros numeros es: " + suma);
		System.out.println("El producto del tercero y cuarto numero es: " + producto);
		
		
		
		
	}
}
