package fila;

import java.util.LinkedList;
import java.util.Queue;


public class TesteQueueMain {

    public static void main(String[] args) {
        
        Queue<Integer> fila = new LinkedList<>();
        
        fila.add(2);
        fila.add(5);
        fila.add(7);
        fila.add(9);
        System.out.println(fila.peek() + "\n");
        System.out.println(fila.remove() + "\n");
        fila.add(10);
        
        for (int i=0; i<5; i++)
            System.out.println(fila.remove());   
        
        
    }
    
}
