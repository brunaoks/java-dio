package exercicio;

public class arrays {
	public static void main(String[] args) {

		int contador = 0;
		int[] vetor = { 1, 2, 3, 4, 5, 6 };

		System.out.print("Vetor: ");
		while (contador < (vetor.length)) {
			System.out.print(vetor[contador] + " ");
			contador++;
		}

		System.out.println("\nVetor invertido: ");
		for (int i = (vetor.length - 1); i >= 0; i--) {
			System.out.print(vetor[i] + " ");
		}

	}
}
