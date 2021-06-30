package rascunhos;

import javax.swing.JOptionPane;

public class Fatorial {

    public static int fatorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * fatorial(n-1);
    }
            
    public static void main(String[] args) {
        int n = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "Número para calcular fatorial:"));
        JOptionPane.showMessageDialog(null, 
                n + "! = " + fatorial(n));
    }

}
