public class Cubos {

    public static String cubos(int n) {
        if (n == 1)
            return "1";
        else {
            return cubos(n-1) + " " + n*n*n;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nCubo até 10: " + cubos(10) + "\n");
    }
    
}
