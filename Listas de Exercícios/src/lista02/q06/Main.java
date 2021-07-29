package lista02.q06;

import java.util.Scanner;

public class Main {

    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        System.out.print("Palavra: ");
        String palavra = teclado.next();
              
        char[] letras = palavra.toCharArray();

        Bubblesort.sort(letras);
        for (char letra : letras)
            System.out.print(letra);
        System.out.println();
    }
}
