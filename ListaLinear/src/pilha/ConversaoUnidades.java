package pilha;

import java.util.Stack;

public class ConversaoUnidades {
    
    public static String decimalParaBinario(int numDecimal) {
        Stack<Integer> pilha = new Stack<>();
        
        int numero = numDecimal;
        int resto;
        String binario = "";
        while (numero > 0) {
            resto = numero % 2;
            pilha.push(resto);
            numero = numero / 2;
        }
        while (!pilha.isEmpty())
            binario += pilha.pop().toString();
        return binario; 
    }
    
    public static void main(String[] args) {
        System.out.println(decimalParaBinario(1024));
    }
    
}
