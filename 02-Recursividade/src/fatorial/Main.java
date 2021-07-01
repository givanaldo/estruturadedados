package fatorial;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = teclado.nextInt();

        long inicio, fim;

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial recursivo = " + Fatorial.fatorial1(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial interativo = " + Fatorial.fatorial2(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        
        inicio = System.currentTimeMillis();
        System.out.println("Fatorial recursivo grande = " + Fatorial.fatorial3(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");

        inicio = System.currentTimeMillis();
        System.out.println("Fatorial interativo grande = " + Fatorial.fatorial4(n));
        fim = System.currentTimeMillis();
        System.out.println(" -- Tempo: " + (fim - inicio) + " mseg");       
    }
}
