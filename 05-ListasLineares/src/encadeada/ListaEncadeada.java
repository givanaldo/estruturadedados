package encadeada;

public class ListaEncadeada {
	private Celula inicio;
	private Celula fim;

	public void adiciona(Pessoa elemento) {
		Celula celula = new Celula(elemento);
		if (inicio == null) {
			inicio = celula;
			fim = celula;
		} else {
			fim.setProximo(celula);
			fim = celula;
		}
	}

	public void adiciona(int posicao, Pessoa elemento) {
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
	}

	public void adicionaInicio(Pessoa elemento) {
		Celula celula = new Celula(elemento);
		if (inicio == null) {
			inicio = celula;
			fim = celula;
		} else {
			celula.setProximo(inicio);
			inicio = celula;
		}
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
	}

	public void listarTodos() {
		Celula aux = inicio;
		while (aux != null) {
			Pessoa p = aux.getElemento();
			System.out.println(p.toString());
			aux = aux.getProximo();
		}
	}
}
