package senati;

import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		float num1 = 0, num2 = 0;
		
		System.out.print("Ingrese primer n�mero: ");
		num1 = scn.nextFloat();
		
		System.out.print("Ingrese segundo n�mero: ");
		num2 = scn.nextFloat();
		
		System.out.println("N�meros Ingresados");
		System.out.println("==================");
		System.out.println("N�mero 1: " + num1);
		System.out.println("N�mero 2: " + num2);
	}
}
