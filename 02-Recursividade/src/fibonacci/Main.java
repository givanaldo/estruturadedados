package fibonacci;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        long inicio, fim;
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int nFib = teclado.nextInt();
        
        inicio = System.currentTimeMillis();
        System.out.print("\nFibonnaci Direto:    " + Fibonacci.fibonacciDireto(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.print("Fibonnaci Iterativo: " + Fibonacci.fibonacciIterativo(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.print("Fibonnaci Recursivo: " + Fibonacci.fibonacciRecursivo(nFib));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");
    }
}
