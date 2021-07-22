package lista02.q05;

import java.util.ArrayList;

public class Insertionsort {

    public static void sort(ArrayList<String> lista) {
        int n = lista.size();

        // comparar Strings ==> CompareTo
        for (int i = 0; i <= n - 1; i++) {
            String aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && aux.compareTo(lista.get(j)) < 0) {
                lista.set(j+1, lista.get(j));
                j = j - 1;
            }
            lista.set(j + 1, aux);
        }
    }
}
