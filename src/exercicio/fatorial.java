package exercicio;

import java.util.Scanner;

public class fatorial {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int fat;
		int multiplicacao = 1;
		
		System.out.println("Número: ");
		fat = scan.nextInt();
		
		
		System.out.print(fat +"!" + "= " );
		for ( int j = fat; j >= 1 ; j-- ) {
			multiplicacao = multiplicacao * j;
		}
		System.out.println(multiplicacao);
	}
}
