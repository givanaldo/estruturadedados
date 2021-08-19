package encadeada;

public class ListaEncadeadaMain {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
		Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
		Pessoa gabriel = new Pessoa("Gabriel", "5555-5555", "gabriel@uol.com.br");

		ListaEncadeada alunos = new ListaEncadeada();
		alunos.adiciona(maria);
		alunos.adiciona(joao);
		alunos.adiciona(gabriel);

		alunos.listarTodos();
		System.out.println("");

		alunos.adiciona(5, new Pessoa("Rildo", "555-2222", "rildo@msn.com"));
		alunos.adiciona(new Pessoa("José", "2222-2222", "jose@bol.com.br"));
		alunos.adiciona(new Pessoa("Alex", "3201-2012", "alex@bol.com.br"));
		alunos.listarTodos();

		//System.out.println("");
		//alunos.remover(2);
		//alunos.listarTodos();
	}

}
