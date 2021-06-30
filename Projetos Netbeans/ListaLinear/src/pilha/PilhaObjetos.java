package pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PilhaObjetos {

    
    
    public static void main(String[] args) {
        Stack<Livro> pilha = new Stack<>();
        Queue<Livro> fila = new LinkedList<>();
        
        Livro l1 = new Livro("Cálculo", "Munem Foulis");
        Livro l2 = new Livro("Harry Potter", "J. K. Howlling");
        Livro l3 = new Livro("O Senhor dos Anéis" , "J. R. R. Tolkien");
        
        pilha.push(l1);
        pilha.push(l2);
        pilha.push(l3);
        
        fila.add(l1);
        fila.add(l2);
        fila.add(l3);
        
        System.out.println(pilha.pop());
        System.out.println(pilha.peek());
        System.out.println("");
        System.out.println(fila.remove());
        System.out.println(fila.element());
        
    }

}
