package exercicio;

import java.util.Scanner;

public class parImpar {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int qtdnum;
		int count = 0;
		int numero;
		int qtdPares = 0, qtdImpares = 0;

		System.out.println("Quantidade de n�meros: ");
		qtdnum = scan.nextInt();

		do {
			System.out.println("N�mero: ");
			numero = scan.nextInt();

			if (numero % 2 == 0) {
				qtdPares++;
			} else {
				qtdImpares++;
			}

			count++;
		} while (count < qtdnum);
		
		System.out.println("Quantidade de n�meros pares: " + qtdPares);
		System.out.println("Quantidade de n�meros impares: " + qtdImpares);
		
	}
}
