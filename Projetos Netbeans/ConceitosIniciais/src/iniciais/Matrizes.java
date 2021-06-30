package iniciais;

import java.util.Scanner;

public class Matrizes {
    
    public static void main(String[] args) {
        
        int linhas = 5; // alunos
        int colunas = 4; // notas
        float notas[][] = new float[linhas][colunas];
        float media[] = new float[linhas];
        String situacao[] = new String[linhas];
        
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<linhas; i++) {
            System.out.println("Aluno " + (i+1) + ":");
            for (int j=0; j<colunas; j++) {
                System.out.print("- nota " + (j+1) + ": ");
                notas[i][j] = teclado.nextFloat();
                media[i] += notas[i][j];
            }
            media[i] /= 4;
            if (media[i] >= 6.0) situacao[i] = "Aprovado";
            else if (media[i] >= 3.0) situacao[i] = "Recuperação";
            else situacao[i] = "Reprovado";
        }
                    
        
        System.out.println("\nRESULTADOS: ");
        for (int i=0; i<linhas; i++) {
            System.out.print("Aluno " + (i+1) + ": ");
            for (int j=0; j<colunas; j++) 
                System.out.print(notas[i][j] + " ");
            System.out.println(" -- Média = " + media[i] + 
                    " -- Situação: " + situacao[i]);  
        }
    }
}
