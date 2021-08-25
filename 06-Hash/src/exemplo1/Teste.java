package exemplo1;

import java.util.List;

public class Teste {
	public static void main(String[] args) {

		ConjuntoEspalhamento conjunto = new ConjuntoEspalhamento();

		conjunto.adiciona("palavra");
		conjunto.adiciona("computador");
		conjunto.adiciona("apostila");
		conjunto.adiciona("instrutor");
		conjunto.adiciona("mesa");
		conjunto.adiciona("telefone");

		List<String> palavras = conjunto.pegaTodas();
		System.out.println("Palavras:");
		for (String palavra : palavras) {
			System.out.println("- " + palavra);
		}

		if (!conjunto.contem("apostila"))
			System.out.println("Erro: não tem a palavra: apostila");

		conjunto.remove("apostila");

		palavras = conjunto.pegaTodas();
		System.out.println("Palavras:");
		for (String palavra : palavras) {
			System.out.println("- " + palavra);
		}
		
		
		if (conjunto.contem("apostila"))
			System.out.println("Erro: tem a palavra: apostila");

		if (conjunto.tamanho() != 5)
			System.out.println("Erro: o tamanho do conjunto deveria ser 5");
	}
}