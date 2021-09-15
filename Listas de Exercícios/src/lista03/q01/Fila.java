package lista03.q01;

// Supor uma fila numérica com n elementos

public class Fila {
	private int fila[];
	private int proximo;

	public Fila(int tamanho) {
		fila = new int[tamanho];
		proximo = 0;
	}

	public void enqueue(int n) {
		fila[proximo] = n;
		proximo++;
	}

	public int dequeue() {
		if (isEmpty())
			return -1;
		int n = fila[0];
		for (int i = 0; i < proximo; i++)
			this.fila[i] = fila[i + 1];
		proximo--;
		return n;
	}

	public int front() {
		return fila[0];
	}

	public int size() {
		return proximo;
	}

	public boolean isEmpty() {
		return proximo == 0;
	}

	public String toString() {
		if (isEmpty())
			return "Fila vazia";
		String listagem = "";
		for (int i = 0; i < proximo; i++)
			listagem += fila[i] + " ";
		return listagem;
	}
}
