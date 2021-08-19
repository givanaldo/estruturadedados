package continua;

import java.util.ArrayList;

public class ListaLinearArrayListMain {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("João", "98888-0088", "joao@gmail.com");
		Pessoa maria = new Pessoa("Maria", "99999-3333", "maria@gmail.com");
		Pessoa gabriel = new Pessoa("Gabriel", "5555-5555", "gabriel@uol.com.br");

		ArrayList<Pessoa> alunos = new ArrayList<>();
		
		alunos.add(maria);
		alunos.add(joao);
		alunos.add(gabriel);
		for (Pessoa aluno : alunos)
			System.out.println(aluno.toString());
		System.out.println("");

		alunos.add(new Pessoa("José", "2222-2222", "jose@bol.com.br"));
		alunos.add(new Pessoa("Alex", "3201-2012", "alex@bol.com.br"));
		for (Pessoa aluno : alunos)
			System.out.println(aluno.toString());

		alunos.remove(joao);
		System.out.println("");
		for (Pessoa aluno : alunos)
			System.out.println(aluno.toString());

	}

}
