package lista02.q03;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int numElementos = 1000;
        //int numElementos = 10000;
        //int numElementos = 100000;
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
        lista02.q02.Quicksort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô início): " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        lista02.q02.MergeSort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Mergesort: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        lista02.q02.Insertionsort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Insertionsort: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        lista02.q02.Selectionsort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Selectionsort: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        lista02.q02.Bubblesort.sort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Bubblesort: " + (endTime - startTime) + " milisegundos");
    }
}
