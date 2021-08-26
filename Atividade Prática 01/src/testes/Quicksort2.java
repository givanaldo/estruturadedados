package testes;

public class Quicksort2 {

    public static void quicksort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = partition(vetor, inicio, fim);

            System.out.print("quicksort left: ");
            for (int k=inicio; k<=posicaoPivo-1; k++)
                System.out.print(vetor[k] + " ");
            System.out.println("");
    
            quicksort(vetor, inicio, posicaoPivo - 1);

            System.out.print("quicksort right: ");
            for (int k=posicaoPivo + 1; k<=fim; k++)
                System.out.print(vetor[k] + " ");
            System.out.println("");

            quicksort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int partition(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        System.out.println("Pivô: " + pivo);      

        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
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
