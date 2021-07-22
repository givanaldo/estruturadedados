package lista02.q01;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int numElementos = 100000;
        ArrayList<Integer> numeros = new ArrayList<>();

        // sequência aleatória
        for (int i = 0; i < numElementos; i++) {
            numeros.add(i);
        }
        Collections.shuffle(numeros);
        
        int[] elementos = new int[numElementos];
        for (int i = 0; i < numElementos; i++) {
            elementos[i] = numeros.get(i);
        }

        int[] vetor;
        long startTime, endTime;

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        QuicksortPivoInicio.quicksort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô início): " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        QuicksortPivoFinal.quicksort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô final): " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        QuicksortPivoMeio.quicksort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô meio): " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        QuicksortPivoAleatorio.quicksort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Quicksort (pivô aleatório): " + (endTime - startTime) + " milisegundos");
    }
}
