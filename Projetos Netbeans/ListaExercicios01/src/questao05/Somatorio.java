package questao05;

public class Somatorio {

    public static int somatorioN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somatorioN(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Somatório de 1..6: " + somatorioN(6));
    }

}
