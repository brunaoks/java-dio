package exercicio;

import java.util.Scanner;

public class tabuada {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tabuada;
		
		System.out.println("Digite a tabuada desejada: ");
		tabuada = scan.nextInt();
		
		System.out.println("Tabuada de " + tabuada);
		
		
		for ( int i = 1; i <= 10; i++ ) {
			System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
		}
	}
}
