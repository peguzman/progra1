
import java.util.Scanner;


public class SumaPromedio {


	public static void main (String[] Args){
		
		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2, numero3, numero4;
		int suma;
		int promedio;
		
		System.out.print("Digite el primer numero");
		numero1 = teclado.nextInt();
		System.out.print("Digite el segundo numero");
		numero2 = teclado.nextInt();
		System.out.print("Digite el tercer numero");
		numero3 = teclado.nextInt();
		System.out.print("Digite el cuarto numero");
		numero4 = teclado.nextInt();
		
		suma= numero1+numero2+numero3+numero4;
		promedio= suma/4;
		
		System.out.println("La suma de los numeros es: " + suma);
		System.out.println("El promedio de los numeros es: " + promedio);
	}
}
