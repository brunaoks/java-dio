package exercicio;

import java.util.Scanner;

public class ex_maior {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num;
		int i = 0;
		int maior = 0;
		float media = 0;

		do {
			System.out.println("Digite os valores: ");
			num = scan.nextInt();

			media = media + num;
			
			
			if (num > maior) {
				maior = num;
			}

			i++;
		} while (i < 5);
		
		System.out.println("Maior: " + maior);
		System.out.println("Média: " + media / 5);
	}

}