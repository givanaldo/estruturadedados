package lista03.q01;

public class Main {

	public static void main(String[] args) {
		Fila fila = new Fila(10);
		
		fila.enqueue(4);
		fila.enqueue(2);
		fila.enqueue(9);
		fila.enqueue(8);
		System.out.println("Fila: " + fila.toString());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Front: " + fila.front());
		System.out.println("Fila: " + fila.toString());		
		System.out.println("Vazia? " + fila.isEmpty());
		System.out.println("Tamanho: " + fila.size());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Fila: " + fila.toString());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Fila: " + fila.toString());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Vazia? " + fila.isEmpty());
		System.out.println("Removido: " + fila.dequeue());
		System.out.println("Vazia? " + fila.isEmpty());
	}

}
