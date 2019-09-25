package prova2019;

public class Maximo {

    public static int maximo(int v[], int n) {
        // caso base
        if (n == 1) {
            return v[0];
        } else {
            int x = maximo(v, n - 1);
            if (x > v[n - 1]) {
                return x;
            } else {
                return v[n - 1];
            }
        }
    }

    public static void main(String[] args) {
        int vetor[] = {2, 5, 87, 23, 9, 12, 45, 23, 65};
        System.out.println("Máximo: " + maximo(vetor, vetor.length));
    }

}
