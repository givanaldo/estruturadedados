package lista02.q04;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int numElementos = 10000;
        ArrayList<Integer> numeros = new ArrayList<>();

        // sequência aleatória
        for (int i = 0; i < numElementos; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);

        // sequência invertida
        //for (int i = numElementos-1; i >= 0; i--)
        //	numeros.add(i);
        
        int[] elementos = new int[numElementos];
        for (int i = 0; i < numElementos; i++) {
            elementos[i] = numeros.get(i);
        }

        int[] vetor;
        long startTime, endTime;

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        HeapSort.heapsort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("HeapSort 1: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        HeapSort.heapsort2(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("HeapSort 2: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        HeapSort.heapsort3(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("HeapSort 3: " + (endTime - startTime) + " milisegundos");        
        
        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        ShellSort.shellsort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Shellsort 1: " + (endTime - startTime) + " milisegundos");        

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        ShellSort.shellsort2(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Shellsort 2: " + (endTime - startTime) + " milisegundos");                
    }
}
