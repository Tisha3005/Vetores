public class VetorDeVetorCrescente {

	public static void main(String[] args) {

		int[] primeiroVetor = { 24, 2, 12, 45, 13, 17, 38, 28, 82, 1, 8 };
		int[] segundoVetor = new int[primeiroVetor.length];
		int numeroMenor, menorValor;

		for (int i = 0; i < primeiroVetor.length - 1; i++) {
			numeroMenor = i;
			menorValor = primeiroVetor[i];

			for (int j = i + 1; j < primeiroVetor.length; j++) {
				if (primeiroVetor[j] < menorValor) {
					numeroMenor = j;
					menorValor = primeiroVetor[j];
				}
			}
			primeiroVetor[numeroMenor] = primeiroVetor[i];
			primeiroVetor[i] = menorValor;
		}
		for (int i = 0; i < primeiroVetor.length; i++) {
			int j = 0;
			segundoVetor[j] = primeiroVetor[i];
			System.out.print(segundoVetor[j] + " ");
		}
	}
}
