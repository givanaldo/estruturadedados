package lista02.q01;

public class QuicksortPivoFinal {
    public static void quicksort(int[] v) {
        partition(v, 0, v.length - 1);
    }

    private static void partition(int[] v, int left, int right) {
        if (v == null || v.length == 0) {
            return;
        }

        if (left >= right) {
            return;
        }

        // selecionar pivô (início)
        int pivot = v[right];

        // esquerda < pivô e direita > pivô
        int i = left, j = right;
        while (i <= j) {
            while (v[i] < pivot) {
                i++;
            }

            while (v[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = v[i];
                v[i] = v[j];
                v[j] = temp;
                i++;
                j--;
            }
        }

        // ordene as duas partes recursivamente
        if (left < j) {
            partition(v, left, j);
        }

        if (right > i) {
            partition(v, i, right);
        }
    }
}
