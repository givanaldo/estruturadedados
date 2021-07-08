package algoritmos;

public class MergeSort {

    public static int[] mergesort(int[] v) {
        if (v.length == 1) {
            return v;
        } else {
            // Cria vetor para armazenar a parte esquerda
            int[] left = new int[v.length / 2];
            System.arraycopy(v, 0, left, 0, left.length);

            // Cria vetor para armazenart a parte direita
            int[] right = new int[v.length - left.length];
            System.arraycopy(v, left.length, right, 0, right.length);

            // Ordena as partes esquerda e direita do vetor v
            left = mergesort(left);
            right = mergesort(right);

            // Faz a união do vetores ordenados, retornando o vetor v ordenado.
            merge(left, right, v);

            return v;
        }
    }

    private static void merge(int[] left, int[] right, int[] whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        // Enquanto houverem elementos nos conjuntos (esquerdo e direito),
        // continue retirando o menor valor entre left[leftIndex] e
        // right[rightIndex] e adicionando em both[bothIndex].
        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex] < right[rightIndex]) {
                whole[wholeIndex] = left[leftIndex];
                leftIndex++;
            } else {
                whole[wholeIndex] = right[rightIndex];
                rightIndex++;
            }
            wholeIndex++;
        }

        int[] rest;
        int restIndex;
        if (leftIndex >= left.length) {
            // O conjunto esquerdo foi usado...
            rest = right;
            restIndex = rightIndex;
        } else {
            // O conjunto direito foi usado...
            rest = left;
            restIndex = leftIndex;
        }

        // Copie o restante do conjunto (esquerdo ou direito) 
        // que não foi usado.
        for (int i = restIndex; i < rest.length; i++) {
            whole[wholeIndex] = rest[i];
            wholeIndex++;
        }
    }

}
