public class Vetor {

	public static void main(String[] args) {

		int numeros[] = { 1, 2, 4, 8, 11, 20 };
		int numeroBuscado = 8;

		int retorno = buscaNumero(numeros, numeroBuscado);
		System.out.println(retorno);
	}

	public static int buscaNumero(int[] numeros, int numeroBuscado) {

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == numeroBuscado) {
				System.out.println("tem no array" + " " + i);
				return i;
			}
		}
		return -1;
	}
}


