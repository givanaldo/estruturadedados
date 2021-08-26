public class Mergesort {

    public static int[] mergesort(int[] v) {
        if (v.length == 1) {
            return v;
        } else {
            
            System.out.print("mergesort: ");
            for (int i=0; i<v.length; i++)
                System.out.print(v[i] + " ");
            System.out.println("");
            
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

        // As long as neither the left nor the right array has
        // been used up, keep taking the smaller of left[leftIndex]
        // or right[rightIndex] and adding it at both[bothIndex].
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
            // The left array has been use up...
            rest = right;
            restIndex = rightIndex;
        } else {
            // The right array has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever array (left or right) was not used up.
        for (int i = restIndex; i < rest.length; i++) {
            whole[wholeIndex] = rest[i];
            wholeIndex++;
        }
        
        System.out.print("merge: ");
        for (int i=0; i<whole.length; i++)
                System.out.print(whole[i] + " ");
            System.out.println("");
    }

}
