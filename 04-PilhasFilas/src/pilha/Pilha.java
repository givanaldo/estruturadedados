package pilha;

import java.util.ArrayList;

public class Pilha {

    private ArrayList<Pessoa> pilha;
    
    public Pilha() {
        pilha = new ArrayList<>();
    }
    
    public Pilha(ArrayList<Pessoa> pilha) {
        this.pilha = pilha;
    }
    
    public void push(Pessoa pessoa) {
        pilha.add(pessoa);
    }
    
    public Pessoa pop() {
        if (isEmpty())
            return null;
        else
            return pilha.remove(pilha.size()-1);
    }
    
    public Pessoa top() {
        if (isEmpty())
            return null;
        else
            return pilha.get(pilha.size()-1);
    }
    
    public int size() {
        return pilha.size();
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public void listAll() {
        for (Pessoa pessoa : pilha)
            System.out.println(pessoa);
    }
}
