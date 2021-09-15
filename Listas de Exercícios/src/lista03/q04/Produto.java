package lista03.q04;

public class Produto {
	private String tipo;
	private String nome;
	private double preço;
	
	public Produto(String tipo, String nome, double preço) {
		this.tipo = tipo;
		this.nome = nome;
		this.preço = preço;
	}

	@Override
	public String toString() {
		return "[" + tipo + "] " + nome + ", R$ " + preço;
	}
	
	
}
