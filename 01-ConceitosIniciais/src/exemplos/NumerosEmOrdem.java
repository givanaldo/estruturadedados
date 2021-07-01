package exemplos;

import java.util.Scanner;

public class NumerosEmOrdem {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 10;
        int numeros[] = new int[n];
        
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
        
        System.out.println("Números ordenados");
        for (int i=0; i<n; i++)
            System.out.print(numeros[i] + " ");
    }
    
}
