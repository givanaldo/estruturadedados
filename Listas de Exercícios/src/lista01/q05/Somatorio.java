package lista01.q05;

public class Somatorio {

    public static int somatorio(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somatorio(n - 1);
        }
    }

    public static void main(String[] args) {
    	int n = 20;
        System.out.printf("Somatório de 1..%d: %d", n, somatorio(n));
    }

}
