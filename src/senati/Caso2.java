package senati;

import java.util.Scanner;

public class Caso2 {
	
	public static void main(String[] args) {
		// Instancia a la clase Scanner
		// Crear un objeto a partir de una clase
		Scanner scn = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.print("Ingrese un n�mero: ");
		numero = scn.nextInt();
		
		System.out.println("N�mero Ingresado");
		System.out.println("================");
		System.out.println("N�mero: " + numero);
	}
}