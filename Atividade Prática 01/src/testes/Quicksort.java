package testes;

public class Quicksort {
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
        int pivot = v[left];
        System.out.println("Pivô: " + pivot);

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
            System.out.print("quicksort left: ");
            for (int k=left; k<=j; k++)
                System.out.print(v[k] + " ");
            System.out.println("");
    
            partition(v, left, j);
        }

        if (right > i) {
            System.out.print("quicksort right: ");
            for (int k=i; k<=right; k++)
                System.out.print(v[k] + " ");
            System.out.println("");
    
            partition(v, i, right);
        }
    }
}
