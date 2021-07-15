package exemplos;

import java.util.Scanner;

public class CasasDecimais {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		System.out.print("Número com casas decimais: ");
		float numero = teclado.nextFloat();
		
		System.out.print("Número de casas decimais para exibir: ");
		int casas = teclado.nextInt();
		
		System.out.printf("Número: %." + casas + "f", numero);
		
	}

}
