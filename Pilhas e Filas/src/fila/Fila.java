package fila;

import java.util.LinkedList;

public class Fila {

    private LinkedList<Pessoa> fila;
    
    public Fila() {
        fila = new LinkedList<>();
    }
    
    public void enqueue(Pessoa pessoa) {
        fila.addLast(pessoa);
    }
    
    public Pessoa dequeue() {
        return fila.removeFirst();
    }
    
    public Pessoa front() {
        return fila.getFirst();
    }
    
    public int size() {
        return fila.size();
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public void listAll() {
        for (Pessoa pessoa : fila)
            System.out.println(pessoa);
    }
}
