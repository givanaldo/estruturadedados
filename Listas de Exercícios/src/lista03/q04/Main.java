package lista03.q04;

public class Main {

	public static void main(String[] args) {
		Lista lista = new Lista();
		
		lista.inserir(new Produto("Limpeza", "Bucha", 2.5));
		lista.inserir(new Produto("Limpeza", "Vassoura", 15.0));
		lista.inserir(new Produto("Eletrônico", "Notebook", 4500.0));
		lista.inserir(new Produto("Eletrônico", "Tablet", 1200.8));
		lista.inserir(new Produto("Alimentação", "Café", 8.5));	
		lista.inserir(2, new Produto("Limpeza", "Água Sanitária", 4.9));
		lista.listarTodos();
		//System.out.println("Recuperar:" + lista.recuperar(3));
		System.out.println("Removendo Notebook...");
		lista.remover(3);
		lista.listarTodos();
		System.out.println("Tamanho: " + lista.tamanho());

	}

}
