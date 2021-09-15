package lista03.q06;

public class Lista {
	private Celula inicio;
	private Celula fim;
	private int tamanho;

	public Lista() {
		this.tamanho = 0;
	}

	public void inserir(Automóvel elemento) {
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

	public void inserir(int posicao, Automóvel elemento) {
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

	public void adicionaInicio(Automóvel elemento) {
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

	// TO DO consertar remoção
	public void remover(String placa) {
		Celula aux = inicio;
		if (aux.getElemento().getPlaca().equals(placa))
			inicio = inicio.getProximo();
		else {
			Celula anterior = null;
			while (!aux.getElemento().getPlaca().equals(placa)) {
				anterior = aux;
				aux = aux.getProximo();
			}
			anterior.setProximo(anterior.getProximo().getProximo());
		}
		tamanho--;
	}

	public int tamanho() {
		return tamanho;
	}
	
	public void listarTodos() {
		Celula aux = inicio;
		while (aux != null) {
			Automóvel p = aux.getElemento();
			System.out.println(p.toString());
			aux = aux.getProximo();
		}
	} 
}
