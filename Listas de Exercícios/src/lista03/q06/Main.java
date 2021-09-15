package lista03.q06;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.inserir(new Automóvel("DHS-3209", "José Ferreira", LocalDateTime.now().toString()));
		lista.inserir(new Automóvel("NMS-1109", "Abel Silva", LocalDateTime.now().toString()));
		lista.inserir(new Automóvel("JKK-0913", "Clara Souza", LocalDateTime.now().toString()));
		lista.inserir(new Automóvel("KKK-0022", "Jorge Furtado", LocalDateTime.now().toString()));
		lista.inserir(new Automóvel("AQD-2413", "Maria Cecília", LocalDateTime.now().toString()));	
		lista.listarTodos();
		System.out.println("Quantidade: " + lista.tamanho());
		lista.remover("NMS-1109");
		lista.listarTodos();
		System.out.println("Quantidade: " + lista.tamanho());
	}

}
