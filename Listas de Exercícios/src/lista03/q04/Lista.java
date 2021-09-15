package lista03.q04;

public class Lista {
	private Celula inicio;
	private Celula fim;
	private int tamanho;

	public Lista() {
		this.tamanho = 0;
	}

	public void inserir(Produto elemento) {
		Celula celula = new Celula(elemento);
		if (inicio == null) {
			inicio = celula;
			fim = celula;
		} else {
			fim.setProximo(celula);
			fim = celula;
		}
		tamanho++;
	}

	public void inserir(int posicao, Produto elemento) {
		Celula celula = new Celula(elemento);
		if (inicio == null) { // lista vazia
			inicio = celula;
			fim = celula;
		} else {
			if (posicao == 0) {
				celula.setProximo(inicio);
				inicio = celula;
			} else {
				Celula aux = inicio;
				for (int i = 1; i < posicao; i++)
					aux = aux.getProximo();
				celula.setProximo(aux.getProximo());
				aux.setProximo(celula);
			}
		}
		tamanho++;
	}

	public void adicionaInicio(Produto elemento) {
		Celula celula = new Celula(elemento);
		if (inicio == null) {
			inicio = celula;
			fim = celula;
		} else {
			celula.setProximo(inicio);
			inicio = celula;
		}
		tamanho++;
	}

	public void remover(int posicao) {
		if (posicao == 0)
			inicio = inicio.getProximo();
		else {
			Celula aux = inicio;
			for (int i = 1; i < posicao; i++)
				aux = aux.getProximo();
			aux.setProximo(aux.getProximo().getProximo());
		}
		tamanho--;
	}

	public int tamanho() {
		return tamanho;
	}
	
	public void listarTodos() {
		Celula aux = inicio;
		while (aux != null) {
			Produto p = aux.getElemento();
			System.out.println(p.toString());
			aux = aux.getProximo();
		}
	} 
}
