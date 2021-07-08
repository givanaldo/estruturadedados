package hanoi;

public class Hanoi {

    // Método que realiza o movimento de um disco entre dois pinos.
    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }

    // Método que implementa a recursão
    // O = pino origem ## D = pino destino ## T = pino de trabalho
    public static void hanoi(int n, int O, int T, int D) {
        if (n > 0) {
            hanoi(n - 1, O, D, T);
            mover(O, D);
            hanoi(n - 1, T, O, D);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 1, 2, 3);
        System.out.println("Movimentos: " + (Math.pow(2, n)-1));
    }
}
