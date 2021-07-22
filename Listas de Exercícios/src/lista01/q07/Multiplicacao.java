package lista01.q07;

public class Multiplicacao {

    public static int multiplicacao(int n1, int n2) {
        if (n2 == 1) {
            return n1;
        } else {
            return n1 + multiplicacao(n1, n2 - 1);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("8 * 10: " + multiplicacao(8, 10));
        
    }
}
