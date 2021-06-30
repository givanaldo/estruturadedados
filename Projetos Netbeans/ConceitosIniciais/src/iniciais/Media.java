package iniciais;

import java.util.Scanner;

public class Media {

    public static void main(String[] args) {

        double notas[] = new double[4];
        double media = 0.0;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: ", (i + 1));
            notas[i] = teclado.nextDouble();
            media += notas[i];
        }
        media /= 4;

        System.out.printf("NOTAS: ");
        for (double nota : notas) {
            System.out.printf("%.1f  ", nota);
        }
        System.out.printf("\nMédia = %.1f \n", media);

        if (media >= 6.0) {
            System.out.println("Aprovado.");
        } else if (media >= 3.0) {
            System.out.println("Recuperação.");
            System.out.println("Digite a nota da recuperação.");
            double notaRecuperacao = teclado.nextDouble();
            double mediaFinal = (media + notaRecuperacao) / 2;
            if (mediaFinal >= 6.0) {
                System.out.println("Aprovado.");
            } else {
                System.out.println("Reprovado.");
            }
        } else {
            System.out.println("Reprovado.");
        }
    }
}
