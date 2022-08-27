
public class VetorBuscaBinariaNew {

	public static void main(String[] args) {
//int contador = 0;
		int numeros[] = { 0, 1, 2, 4, 8, 11, 20, 22, 50, 100, 101, 102 };
		int numMinimo = 0;
		int numMaximo = numeros.length - 1;
		int numeroBuscado = 11;

		extrair(numeros, numeroBuscado, numMinimo, numMaximo);
	}

	private static void extrair(int[] numeros, int numeroBuscado, int numMinimo, int numMaximo) {

		while (numMinimo <= numMaximo) {
			int contador = 0;
			int metade = ((numMaximo + numMinimo) / 2);
		//	contador++;
			if (numeros[metade] == numeroBuscado) {
				System.out.println("posicao " + " " + metade);
				break;
			}
			
			if (numeros[metade] < numeroBuscado) {
				numMinimo = metade + 1;
			} else {
				numMaximo = metade - 1;
			}
		}
		//System.out.println(contador);
		if (numMinimo > numMaximo) {
			System.out.println("posicao nao");
		}
	}
}