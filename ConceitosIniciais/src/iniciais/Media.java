package iniciais;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        
        double notas[] = new double[4];
        double media = 0.0;
        Scanner teclado = new Scanner(System.in);
        
        for (int i=0; i<notas.length; i++) {
            System.out.printf("Nota %d: ", (i+1));
            notas[i] = teclado.nextDouble();
            media += notas[i];
        }
        media /= 4;
        
        System.out.printf("NOTAS: ");
        for (double nota : notas) {
            System.out.printf("%.1f  ", nota);
        }
        System.out.printf("\nMédia = %.1f \n", media);
    }
    
}
