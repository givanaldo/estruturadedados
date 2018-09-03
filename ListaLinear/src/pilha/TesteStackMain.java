package pilha;

import java.util.Stack;

public class TesteStackMain {
    
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack();
        
        pilha.push(2);
        pilha.push(5);
        pilha.push(7);
        pilha.push(9);
        
        while (!pilha.isEmpty())
            System.out.println(pilha.pop());
        
    }           
}
