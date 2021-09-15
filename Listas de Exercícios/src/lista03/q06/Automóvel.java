package lista03.q06;

public class Automóvel {
	private String placa;
	private String proprietário;
	private String horaEntrada;
	
	public Automóvel(String placa, String proprietário, String horaEntrada) {
		this.placa = placa;
		this.proprietário = proprietário;
		this.horaEntrada = horaEntrada;
	}

	public String getPlaca() {
		return placa;
	}

	@Override
	public String toString() {
		return "[" + placa + "] " + proprietário + ", " + horaEntrada;
	}
	
	
}
