import java.util.*;

public class CalculaArea {

	public static void main (String[] Args){
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		int lado;
		int area;
		
		System.out.print("Ingrese el lado del cuadrado");
		lado = teclado.nextInt();
		area = lado*lado;
		System.out.print("El area del cuadrado es: ");
		System.out.print(area);
		
		
		
		
	}
}
