package questao04;

public class SomaInteiros {

    public static int somaInteiros(int[] v, int n) {
        if (n == 1) {
            return v[0];
        } else {
            return v[n - 1] + somaInteiros(v, n - 1);
        }
    }

    public static void main(String[] args) {
        int[] v = {6, 2, 3, 5, 2, 10};
        System.out.println("Soma: " + somaInteiros(v, v.length));
    }

}
