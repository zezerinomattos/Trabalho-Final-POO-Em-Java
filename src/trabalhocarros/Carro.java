package trabalhocarros;

import java.util.Calendar;

public class Carro {
	private String marca;
	private String nome;
	private String modelo;
	private int ano;
	private int totalAno;
	private int velocidadeMaxima;
	
	public Carro(String marca, String nome, String modelo, int ano) {
		this.marca = marca;
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
		this.velocidadeMaxima = 120;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public int getTotalAno() {
		return totalAno;
	}

	public void setTotalAno(int totalAno) {
		this.totalAno = totalAno;
	}	

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void tempoFabricação() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		this.setTotalAno(ano - getAno());
	}

	@Override
	public String toString() {
		return "Carro [marca= " + marca + ", nome= " + nome + ", modelo= " + modelo + ", ano= " + ano + ", totalAno= "
				+ totalAno + ", velocidadeAtual= "  + velocidadeMaxima + "]";
	}

	
}
