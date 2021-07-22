package lista01.q02;

import java.util.Scanner;

public class Medias {
    private static Scanner teclado;

    public static void main(String[] args) {
        teclado = new Scanner(System.in);
        
        float[][] notas = new float[5][4];
        float[] média = new float[5];
        String[] situação = new String[5];

        for (int aluno=0; aluno<5; aluno++) {
            System.out.printf("== Aluno %d ==\n", aluno+1);
            for (int nota=0; nota<4; nota++) {
                System.out.printf("Nota %d: ", nota+1);
                notas[aluno][nota] = teclado.nextFloat();        
            }
            média[aluno] = (notas[aluno][0] + notas[aluno][1] + notas[aluno][2] + notas[aluno][3]) / 4;
            situação[aluno] = média[aluno] >= 6.0 ? "Aprovado" : média[aluno] >= 3.0 ? "Recuperação" : "Reprovado";
        }

        // Exibindo tudo
        for (int aluno=0; aluno<5; aluno++) {
            System.out.printf("\n== Aluno %d ==\n", aluno+1);
            System.out.print("Notas:");
            for (int nota=0; nota<4; nota++)
                System.out.printf("  %.1f", notas[aluno][nota]);
            System.out.printf("\nMédia:  %.1f ## Situação: %s\n", média[aluno], situação[aluno]);
        }
    }
}
