package ordenacao;

import java.util.ArrayList;
import java.util.Collections;

public class TesteDeCargaOrdenacaoComTempo {

    public static void main(String[] args) {
        int numElementos = 100000;
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
        Sort.bubblesort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Bubblesort: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Sort.selectionsort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Selectionsort: " + (endTime - startTime) + " milisegundos");

        vetor = elementos.clone();
        startTime = System.currentTimeMillis();
        Sort.insertionsort(vetor);
        endTime = System.currentTimeMillis();
        System.out.println("Insertionsort: " + (endTime - startTime) + " milisegundos");

    }
}
