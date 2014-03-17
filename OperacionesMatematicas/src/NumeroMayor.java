import java.util.Scanner;


public class NumeroMayor {

	public static void main (String[] Args){
		Scanner teclado = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.print("Ingrese el primer numero: ");
		num1 = teclado.nextInt();
		System.out.println("Ingrese el segundo numero: ");
		num2 = teclado.nextInt();
		
		
		if (num1 > num2){
			
			System.out.print("El Numero mayor es: " + num1);
			
			
		}
		
		else {
			
			System.out.print("El numero mayor es:  " + num2);
		}
		
		
	}
}
