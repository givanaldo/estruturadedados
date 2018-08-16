package recursividade;

public class MaxDivComum {

    public static int mdc(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        } else {
            return mdc(n2, n1 % n2);
        }
    }

    public static void main(String[] args) {
        System.out.println("MDC(4032, 1272) = " + mdc(4032, 1272));
    }

}
