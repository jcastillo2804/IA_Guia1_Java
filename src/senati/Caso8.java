package senati;

import java.util.Scanner;

public class Caso8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		int lado = 0;
		
		System.out.print("Ingrese lado del cuadrado: ");
		lado = scn.nextInt();
		
		int area = lado * lado;
		int perimetro = lado * 4;
		
		System.out.println("Resultados");
		System.out.println("==================");
		System.out.println("�rea del cuadrado...........: " + area);
		System.out.println("Per�metro del cuadrado......: " + perimetro);
	}
}
