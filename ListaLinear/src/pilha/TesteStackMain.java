package pilha;

import java.util.Stack;

public class TesteStackMain {
    
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();
        
        pilha.push(2);
        pilha.push(5);
        pilha.push(7);
        pilha.push(9);
        
        System.out.println("Topo: " + pilha.peek());
        //System.out.println("Retirar: " + pilha.pop() + "\n");
        System.out.println("Posicao de 5: " + pilha.search(10) + "\n");
        
        while (!pilha.isEmpty())
            System.out.println(pilha.pop());
        
    }           
}
