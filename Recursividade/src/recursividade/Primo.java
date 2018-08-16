package recursividade;

public class Primo {

    static boolean éprimo(int n) {
        return primo(n, n / 2);
    }

    static boolean primo(int n, int k) {
        if (k == 1) {
            return true;
        } else if (n % k == 0) {
            return false;
        } else {
            return primo(n, k - 1);
        }
    }

    public static void main(String[] args) {
        int n = 21;
	System.out.println(éprimo(n));
    }

}
