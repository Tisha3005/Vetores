import java.util.Arrays;

public class VetorBuscaBinaria {

	public static void main(String[] args) {

		//int numeros[] = {0, 1, 2, 4, 8, 11, 20, 22, 100};
		//int numeroBuscado = 8;
		
		int numeros[] = { 0, 1, 2, 4, 8, 11, 20, 22, 50, 100};
		int numeroBuscado = 8;
		int retorno = Arrays.binarySearch(numeros, numeroBuscado);
		
		
		System.out.println("o tamanho do array: "+ numeros.length);
		System.out.println(numeros[4]);

		if (retorno < 0) {
			System.out.println("nao encontrado");
		} else {
			System.out.println("encontrado" + retorno);
		}
	}
}
