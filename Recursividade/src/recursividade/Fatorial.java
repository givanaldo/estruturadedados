package recursividade;

import java.math.BigInteger;
import java.util.Scanner;

public class Fatorial {

    // função recursiva
    public static double fatorial1(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fatorial1(n - 1);
        }
    }

    // função interativa
    public static double fatorial2(int n) {
        double fat = 1;
        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }
        return fat;
    }

    // função recursiva usando BigInteger
    public static BigInteger fatorial3(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger m = BigInteger.valueOf(n);
        return m.multiply(fatorial3(n - 1));
    }

    // função interativa usando BigInteger
    public static BigInteger fatorial4(int n) {
        BigInteger fat = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        long inicio, fim;

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial recursivo = " + fatorial1(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial interativo = " + fatorial2(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial recursivo grande = " + fatorial3(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial interativo grande = " + fatorial4(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

    }

}
