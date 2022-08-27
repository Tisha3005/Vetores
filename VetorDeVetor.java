public class VetorDeVetor {

	public static void main(String[] args) {

		int[] primeiroVetor = { 24, 2, 12, 45, 13, 17, 38, 28, 82, 1, 8 };
		int[] segundoVetor = new int[primeiroVetor.length];

		for (int i = 0; i < primeiroVetor.length; i++) {
			int j = 0;
			segundoVetor[j] = primeiroVetor[i];
			System.out.print(segundoVetor[j] + " ");
		}
	}
}
		
		