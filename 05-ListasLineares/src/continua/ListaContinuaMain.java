package continua;

public class ListaContinuaMain {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
		Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
		Pessoa gabriel = new Pessoa("Gabriel", "5555-5555", "gabriel@uol.com.br");

		ListaContinua alunos = new ListaContinua(3);
		alunos.inserir(maria);
		alunos.inserir(joao);
		alunos.inserir(gabriel);

		alunos.listarTodos();
		System.out.println("");

		alunos.inserir(new Pessoa("José", "2222-2222", "jose@bol.com.br"));
		alunos.inserir(1, new Pessoa("Alex", "3201-2012", "alex@bol.com.br"));
		alunos.listarTodos();

		System.out.println("");
		System.out.println(alunos.recuperar(2));
		alunos.remover(2);
		Pessoa busca = new Pessoa("João", "98888-0088", "joao@gmail.com");
		System.out.println(alunos.contem(busca));

		System.out.println("");
		alunos.listarTodos();

	}

}
