import java.util.Scanner;


public class PerimetroCuadrado {

	public static void main (String[] Args){
		
		Scanner teclado = new Scanner (System.in);
		
		int lado;
		int perimetro;
		System.out.print("Ingrese el tamano del lado del cuadraro");
		lado = teclado.nextInt();
		perimetro = lado * 4;
		
		System.out.print("El Perimetro del cuadrado es: ");
		System.out.print(perimetro);
	}
}
