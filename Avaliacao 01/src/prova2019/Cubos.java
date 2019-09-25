package prova2019;

public class Cubos {

    public static String sequencia_cubos(int n) {
        if (n == 1)
            return "1";
        else {
            return sequencia_cubos(n-1) + " " + n*n*n;
        }
    }

    public static void main(String[] args) {
        System.out.println("Cubo até 10: " + sequencia_cubos(10));
    }
    
}
