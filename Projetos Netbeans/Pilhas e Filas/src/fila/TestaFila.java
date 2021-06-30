package fila;

public class TestaFila {
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
        Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
        Pessoa gabriel = new Pessoa("Gabriel", "5555-5555",  "gabriel@uol.com.br");
        Pessoa jose = new Pessoa("José", "2222-2222", "jose@bol.com.br");
        Pessoa alex = new Pessoa("Alex", "3201-2012", "alex@bol.com.br");
        
        Fila fila = new Fila();
        fila.enqueue(maria);
        fila.enqueue(jose);
        fila.enqueue(joao);
        fila.listAll();
        System.out.println("");
        System.out.println(fila.dequeue());
        System.out.println("");
        fila.listAll();
    }
    
}
