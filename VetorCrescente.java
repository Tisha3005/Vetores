
public class VetorCrescente {

	public static void main(String[] args) {

		int numeros[] = { 24, 2, 12, 45, 13, 17, 38, 28, 82, 1, 8 };
		int numeroMenor, x;

		for (int i = 0; i < numeros.length - 1; i++) {
			numeroMenor = i;
			x = numeros[i];

			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[j] < x) {
					numeroMenor = j;
					x = numeros[j];
				}
			}
			numeros[numeroMenor] = numeros[i];
			numeros[i] = x;
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}