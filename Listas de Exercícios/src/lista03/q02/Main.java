package lista03.q02;

public class Main {

	public static void main(String[] args) {
		Pilha fila = new Pilha(10);
		
		fila.push(4);
		fila.push(2);
		fila.push(9);
		fila.push(8);
		System.out.println("Pilha: " + fila.toString());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Topo: " + fila.top());
		System.out.println("Pilha: " + fila.toString());		
		System.out.println("Vazia? " + fila.isEmpty());
		System.out.println("Tamanho: " + fila.size());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Pilha: " + fila.toString());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Pilha: " + fila.toString());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Vazia? " + fila.isEmpty());
		System.out.println("Removido: " + fila.pop());
		System.out.println("Vazia? " + fila.isEmpty());
	}

}
