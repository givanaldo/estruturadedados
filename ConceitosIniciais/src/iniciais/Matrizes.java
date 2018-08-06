package iniciais;

import java.util.Scanner;

public class Matrizes {
    
    public static void main(String[] args) {
        
        int linhas = 2, colunas = 4;
        float notas[][] = new float[linhas][colunas];
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<linhas; i++) {
            System.out.println("Aluno " + (i+1) + ":");
            for (int j=0; j<colunas; j++) {
                System.out.println("- nota " + (j+1) + ": ");
                notas[i][j] = entrada.nextFloat();
            }
        }
        
        System.out.println("\nNOTAS DIGITADAS: ");
        for (int i=0; i<linhas; i++) {
            System.out.print("Aluno " + (i+1) + ": ");
            for (int j=0; j<colunas; j++) 
                System.out.print(notas[i][j] + " ");
            System.out.println("");  
        }
    }
    
}
