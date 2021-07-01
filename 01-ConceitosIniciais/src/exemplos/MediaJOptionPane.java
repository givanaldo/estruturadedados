package exemplos;

import javax.swing.JOptionPane;

public class MediaJOptionPane {

    public static void main(String[] args) {

        double notas[] = new double[4];
        double media = 0.0;

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Double.parseDouble(
                    JOptionPane.showInputDialog("Nota "+ (i+1) + ": ", 
                                    "digite uma nota (0 a 10)"));
            media += notas[i];
        }
        media /= 4;

        System.out.printf("NOTAS: ");
        for (double nota : notas) {
            System.out.printf("%.1f  ", nota);
        }
        //System.out.printf("\nMédia = %.1f \n", media);
        JOptionPane.showMessageDialog(null, 
                "Média = " + String.format("%.1f", media),
                "Média Aritmética",
                JOptionPane.INFORMATION_MESSAGE);
        
        
        if (media >= 6.0) {
            JOptionPane.showMessageDialog(null, "Aprovado.");
        } else if (media >= 3.0) {
            JOptionPane.showMessageDialog(null, "Recuperação.");
            double notaRecuperacao = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a nota da recuperação"));
            double mediaFinal = (media + notaRecuperacao) / 2;
            if (mediaFinal >= 6.0) {
                JOptionPane.showMessageDialog(null, "Aprovado.");
            } else {
                JOptionPane.showMessageDialog(null, "Reprovado.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado.");
        }
    }
}
