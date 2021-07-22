package lista01.q03;

import java.util.Scanner;

public class NumerosEmOrdem {
    private static Scanner teclado;
    private static final int n = 20;
    private static int numeros[];

    public static void main(String[] args) {
        numeros = new int[n];
        teclado = new Scanner(System.in);
        
        for (int i=0; i<n; i++) {
            System.out.print((i+1) + "º número: ");
            numeros[i] = teclado.nextInt();
        }
        
        int aux;
        for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
                if (numeros[i] > numeros[j]) {
                    aux = numeros[j];
                    numeros[j] = numeros[i];
                    numeros[i] = aux;
                }
            }
        }
        
        System.out.print("Números ordenados: ");
        for (int i=0; i<n; i++)
            System.out.print(numeros[i] + " ");
        System.out.println();
    }
    
}
