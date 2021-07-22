package lista02.q02;

public class Bubblesort {

    public static void sort(int[] v) {

        int n = v.length;

        for (int i = 0; i <= n - 2; i++) {
            for (int j = 0; j <= n - 2 - i; j++) {
                if (v[j] < v[j + 1]) {
                    int aux = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = aux;
                }
            }
        }
    }
}
