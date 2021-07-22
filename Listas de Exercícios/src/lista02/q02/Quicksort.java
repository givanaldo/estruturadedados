package lista02.q02;

public class Quicksort {
    public static void sort(int[] vetor) {
        quicksort(vetor, 0, vetor.length-1);
    }
    
    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = partition(vetor, inicio, fim);
            quicksort(vetor, inicio, posicaoPivo - 1);
            quicksort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int partition(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1;
        int f = fim;

        while (i <= f) {
            if (vetor[i] >= pivo) {
                i++;
            } 
            else if (pivo > vetor[f]) {
                f--;
            } 
            else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }
}
