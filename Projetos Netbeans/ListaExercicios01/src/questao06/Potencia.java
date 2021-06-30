package questao06;

public class Potencia {

    public static int potencia(int k, int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return k;
            default:
                return k * potencia(k, n - 1);
        }
    }

    public static void main(String[] args) {
        int k = 2;
        int n = 10;

        System.out.println(k + "ˆ" + n + ": " + potencia(k, n));
    }
}
