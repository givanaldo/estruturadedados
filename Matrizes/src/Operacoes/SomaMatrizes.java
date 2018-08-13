package Operacoes;

import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Linhas: ");
        int linhas = teclado.nextInt();
        System.out.println("Colunas: ");
        int colunas = teclado.nextInt();
        
        int A[][] = new int[linhas][colunas];
        int B[][] = new int[linhas][colunas];
        int C[][] = new int[linhas][colunas];
        
        // Matriz A
        for (int i=0; i<linhas; i++) {
            for (int j=0; j<colunas; j++) {
                System.out.printf("A[%d][%d]: ", i+1, j+1);
                A[i][j] = teclado.nextInt();
            }
        }
        // Matriz B
        for (int i=0; i<linhas; i++) {
            for (int j=0; j<colunas; j++) {
                System.out.printf("B[%d][%d]: ", i+1, j+1);
                B[i][j] = teclado.nextInt();
                // se quiser, faz a soma aqui 
                // C[i][j] = A[i][j] + B[i][j];
            }
        }
        // Matriz C = A + B
        for (int i=0; i<linhas; i++)
            for (int j=0; j<colunas; j++)
                C[i][j] = A[i][j] + B[i][j];

        // Exibir as matrizes
        // Matriz A
        for (int i=0; i<linhas; i++) {
            for (int j=0; j<colunas; j++) {
                System.out.printf("%3d  ", A[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("+");
        // Matriz B
        for (int i=0; i<linhas; i++) {
            for (int j=0; j<colunas; j++) {
                System.out.printf("%3d  ", B[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("=");
        // Matriz C
        for (int i=0; i<linhas; i++) {
            for (int j=0; j<colunas; j++) {
                System.out.printf("%3d  ", C[i][j]);
            }
            System.out.printf("\n");
        }           
    }
    
}
