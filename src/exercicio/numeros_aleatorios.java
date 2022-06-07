package exercicio;

import java.util.Random;

public class numeros_aleatorios {
	public static void main(String[] args) {
		Random random = new Random();

		int[] numAleatorios = new int[20];

		for (int i = 0; i < numAleatorios.length; i++) {
			int numero = random.nextInt(100);
			numAleatorios[i] = numero;
		}
		System.out.print("Números aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.println(numero + " ");
		}

		System.out.print("\nSucessores dos números aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.print((numero + 1) + " ");
		}

		System.out.print("\nAntecessores dos números aleatórios: ");
		for (int numero : numAleatorios) {
			System.out.print((numero - 1) + " ");
		}
	}
}
