package trabalhocarros;

public class Chevrolet extends Carro{
	private boolean carro;
	private boolean camionete;
	public Chevrolet(String marca, String nome, String modelo, int ano) {
		super(marca, nome, modelo, ano);
		this.carro = true;
	}
	public void stilo(String stilo) {
		if(stilo == "Carro") {
			this.setCarro(true);
			this.setCamionete(false);
		}else {
			this.setCarro(false);
			this.setCamionete(true);
		}
	}
	public boolean getCarro() {
		return carro;
	}
	public void setCarro(boolean carro) {
		this.carro = carro;
	}
	public boolean getCamionete() {
		return camionete;
	}
	public void setCamionete(boolean camionete) {
		this.camionete = camionete;
	}
	
}
