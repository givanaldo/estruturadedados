package recursividade;

import java.util.Scanner;

public class Fibonacci {

    static long fibonacciRecursivo(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    static long fibonacciIterativo(int n) {
        long i = 0;
        long j = 1;

        for (int k = 1; k < n; k++) {
            long t;
            t = i + j;
            i = j;
            j = t;
        }
        return j;
    }
    
    static long fibonacciDireto(int n) {
        double raiz5 = Math.sqrt(5);
        return (long) ((1/raiz5)*(Math.pow((1+raiz5)/2, n) - Math.pow((1-raiz5)/2, n)));
    }

    public static void main(String[] args) {
        long inicio, fim;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int nFib = teclado.nextInt();
        
        inicio = System.currentTimeMillis();
        System.out.print("\nFibonnaci Direto:    " + fibonacciDireto(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.print("Fibonnaci Iterativo: " + fibonacciIterativo(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.print("Fibonnaci Recursivo: " + fibonacciRecursivo(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
    }

}
