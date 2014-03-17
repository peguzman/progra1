/*Realizar un programa que lea por teclado dos números, 
si el primero es mayor al segundo informar su suma y diferencia, en caso 
contrario informar el producto y la división del primero respecto al segundo.*/


import java.util.Scanner;


public class LeeNumeros {
	
	public static void main (String[] args){
		Scanner digite = new Scanner(System.in);
		
		int numero1;
		int numero2;
		int suma;
		int resta;
		int producto;
		int division;
		
		System.out.print("Digite el primer numero: ");
		numero1 = digite.nextInt();
		System.out.println("Digite el segundo numero: ");
		numero2 = digite.nextInt();
		
		if (numero1 > numero2){
			
			suma = numero1 + numero2;
			resta = numero1 - numero2;
			System.out.print("La suma es: " + suma);
			System.out.print("La diferencia es: " + resta);
			
		}
		
		else {
			
			producto = numero1 * numero2;
			division = numero1 / numero2;
			System.out.print("El producto de los dos numeros es: " + producto);
			System.out.println("La division de los dos numeros es: " + division);
			
		}
		
		
		
	}

}
