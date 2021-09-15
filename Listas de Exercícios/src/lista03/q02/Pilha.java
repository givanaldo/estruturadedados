package lista03.q02;

public class Pilha {
	private int pilha[];
	private int topo;

	public Pilha(int tamanho) {
		pilha = new int[tamanho];
		topo = -1;
	}

	public void push(int n) {
		topo++;
		pilha[topo] = n;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int n = pilha[topo];
		topo--;
		return n;
	}

	public int top() {
		return pilha[topo];
	}

	public int size() {
		return topo+1;
	}

	public boolean isEmpty() {
		return topo == -1;
	}

	public String toString() {
		if (isEmpty())
			return "Pilha vazia";
		String listagem = "";
		for (int i = 0; i <= topo; i++)
			listagem += pilha[i] + " ";
		return listagem;
	}    
}
