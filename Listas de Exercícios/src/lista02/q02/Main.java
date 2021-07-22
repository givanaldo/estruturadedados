package lista02.q02;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int numElementos = 20;
        ArrayList<Integer> numeros = new ArrayList<>();

        // sequência aleatória
        for (int i = 0; i < numElementos; i++)
            numeros.add(i);
        Collections.shuffle(numeros);
        
        int[] elementos = new int[numElementos];
        for (int i = 0; i < numElementos; i++) {
            elementos[i] = numeros.get(i);
        }

        int[] vetor;
        long startTime, endTime;

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Quicksort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô início): " + (endTime - startTime) + " milisegundos");
        System.out.print("Vetor: "); for (int n : vetor) System.out.printf("%d ", n); System.out.printf("\n\n");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        MergeSort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Mergesort: " + (endTime - startTime) + " milisegundos");
        System.out.print("Vetor: "); for (int n : vetor) System.out.printf("%d ", n); System.out.printf("\n\n");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Insertionsort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Insertionsort: " + (endTime - startTime) + " milisegundos");
        System.out.print("Vetor: "); for (int n : vetor) System.out.printf("%d ", n); System.out.printf("\n\n");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Selectionsort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Selectionsort: " + (endTime - startTime) + " milisegundos");
        System.out.print("Vetor: "); for (int n : vetor) System.out.printf("%d ", n); System.out.printf("\n\n");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Bubblesort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Bubblesort: " + (endTime - startTime) + " milisegundos");
        System.out.print("Vetor: "); for (int n : vetor) System.out.printf("%d ", n); System.out.printf("\n\n");
    }
}
