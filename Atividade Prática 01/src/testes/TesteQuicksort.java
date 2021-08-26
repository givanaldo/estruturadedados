package testes;

import java.util.ArrayList;
import java.util.Collections;

public class TesteQuicksort {

    public static void main(String[] args) {
        int numElementos = 10;
        ArrayList<Integer> numeros = new ArrayList<>();

        // sequência aleatória
        for (int i = 0; i < numElementos; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);

        //int[] elementos = new int[numElementos];
        //for (int i = 0; i < numElementos; i++) {
        //    elementos[i] = numeros.get(i);
        //}
        int[] elementos = {5, 3, 2, 7, 6, 1, 4, 8, 9, 0};


        int[] vetor;
        long startTime, endTime;
        
        vetor = elementos.clone();
        
        System.out.println("\n===QUICKSORT ===");
        System.out.print("Vetor original: ");
        for (int i=0; i<vetor.length; i++)
            System.out.print(vetor[i] + " ");
        System.out.println("\n");

        startTime = System.currentTimeMillis();
        Quicksort.quicksort(vetor);
        endTime = System.currentTimeMillis();
        
        System.out.print("\nVetor ordenado: ");
        for (int i=0; i<vetor.length; i++)
            System.out.print(vetor[i] + " ");
        System.out.println("");
        
        System.out.println("Quicksort: " + (endTime - startTime) + " milissegundos\n");
        
    }
}
