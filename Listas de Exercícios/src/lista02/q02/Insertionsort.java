package lista02.q02;

public class Insertionsort {

    public static void sort(int[] v) {
        int n = v.length;
        for (int i = 0; i <= n - 1; i++) {
            int aux = v[i];
            int j = i - 1;
            while (j >= 0 && aux > v[j]) {
                v[j + 1] = v[j];
                j = j - 1;
            }
            v[j + 1] = aux;
        }
    }
}
