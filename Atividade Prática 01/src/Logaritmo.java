public class Logaritmo {

    public static int logaritmo(int x, int n) {
        // caso base
        if (x == 1)
            return 0;
        else
            return logaritmo(x/n, n) + 1;

    }

    public static void main(String[] args) {
        int x = 2048, n = 2;
        System.out.printf("\nLog(%d, %d) = %d \n\n", x, n, logaritmo(x, n));
    }
}
