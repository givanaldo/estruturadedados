package questao09;

public class Mmc {

    public static int mdc(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return mdc(n2, n1 % n2);
        }
    }

    public static int mmc(int n1, int n2) {
        return (n1 * n2) / mdc(n1, n2);
    }

    public static void main(String[] args) {
        System.out.println("MDC(20, 15): " + mdc(20, 15));
        System.out.println("MMC(20, 15): " + mmc(20, 15));
    }
}
