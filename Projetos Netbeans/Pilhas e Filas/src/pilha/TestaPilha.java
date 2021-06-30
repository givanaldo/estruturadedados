package pilha;

public class TestaPilha {
    
    public static void main(String[] args) {
        Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
        Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
        Pessoa gabriel = new Pessoa("Gabriel", "5555-5555",  "gabriel@uol.com.br");
        Pessoa jose = new Pessoa("José", "2222-2222", "jose@bol.com.br");
        Pessoa alex = new Pessoa("Alex", "3201-2012", "alex@bol.com.br");
        
        Pilha pilha = new Pilha();
        pilha.push(maria);
        pilha.push(jose);
        pilha.push(joao);
        pilha.listAll();
        System.out.println("");
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.top());
        System.out.println("");
        pilha.listAll();
    }
    
}
