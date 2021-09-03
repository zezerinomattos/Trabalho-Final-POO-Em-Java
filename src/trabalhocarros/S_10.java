package trabalhocarros;

public class S_10 extends Chevrolet{
	private String valvulas;
	private String cor;
	private boolean tracionada;
	public S_10(String marca, String nome, String modelo, int ano,  String valvulas, String cor) {
		super(marca, nome, modelo, ano);
		this.setVelocidadeMaxima(200);
		this.valvulas = valvulas;
		this.cor = cor;
		this.tracionada = false;
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
	
	public boolean isTracionada() {
		return tracionada;
	}
	public void setTracionada(boolean tracionada) {
		this.tracionada = tracionada;
	}
	public void tracao(){
		if(this.isTracionada() == false) {
			this.setTracionada(true);
		}else {
			this.setTracionada(false);
		}
	}
	@Override
	public String toString() {
		return "S_10 [valvulas=" + valvulas + ", cor=" + cor + ", tracionada=" + tracionada +super.toString()+ "]";
	}
	
	
	
}
