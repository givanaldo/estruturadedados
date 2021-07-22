package lista02.q05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.print("Quantidades de nomes: ");
        int n = teclado.nextInt();
        for (int i=0; i<n; i++) {
            System.out.printf("%do. nome: ", i+1);
            String nome = teclado.next();
            nomes.add(nome);
        }

        Insertionsort.sort(nomes);
        System.err.println("\n** Lista Ordenada **");
        for (String nome : nomes)
            System.out.printf("- %s\n", nome);
    }
}
