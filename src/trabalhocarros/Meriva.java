package trabalhocarros;

public class Meriva extends Chevrolet{
	private String valvulas;
	private String cor;
	private int velocidade;
	public Meriva(String marca, String nome, String modelo, int ano,  String valvulas, String cor) {
		super(marca, nome, modelo, ano);
		this.setVelocidadeMaxima(160);
		this.valvulas = valvulas;
		this.cor = cor;
		this.velocidade = 0;
	}
	public String getValvulas() {
		return valvulas;
	}
	public void setValvulas(String valvulas) {
		this.valvulas = valvulas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public void acelerar() {
		this.setVelocidade(getVelocidade() + 8);
	}
	public void frear() {
			this.setVelocidade(getVelocidade() - 4);
	}
	@Override
	public String toString() {
		return "Meriva [valvulas=" + valvulas + ", cor=" + cor + ", velocidade=" + velocidade + "]";
	}
	
	
}
