package lista02.q02;

public class Selectionsort {

    public static void sort(int[] v) {
        int n = v.length;
        for (int i = 0; i <= n - 2; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (v[i] < v[j]) {
                    int aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }
    }
}
