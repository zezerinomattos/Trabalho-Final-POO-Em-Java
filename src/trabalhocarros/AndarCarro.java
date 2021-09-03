package trabalhocarros;

public class AndarCarro implements Dirigindo{
	private int velocidade;
	private int marchaAtual;
	private boolean ligarCarro;
	private boolean andando;
	private String virouPara;
	
	public AndarCarro() {
		this.velocidade = 0;
		this.marchaAtual = 0;
		this.ligarCarro = false;
		this.andando = false;
	}

	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getMarchaAtual() {
		return marchaAtual;
	}
	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}
	public boolean isLigarCarro() {
		return ligarCarro;
	}
	public void setLigarCarro(boolean ligarCarro) {
		this.ligarCarro = ligarCarro;
	}
	public boolean isAndando() {
		return andando;
	}
	public void setAndando(boolean andando) {
		this.andando = andando;
	}
	public String getVirouPara() {
		return virouPara;
	}
	public void setVirouPara(String virouPara) {
		this.virouPara = virouPara;
	}
	@Override
	public void acelerar() {
		if(this.isLigarCarro() && this.isAndando()) {
			this.setVelocidade(getVelocidade() + 5);
		}
		
	}
	@Override
	public void frear() {
		if(this.isAndando() && this.getVelocidade() < 5) {
			this.setAndando(false);
		}else if(this.isAndando() && this.getVelocidade() > 5) {
			this.setVelocidade(getVelocidade() - 5);
		}
		
	}
	@Override
	public void mudarMarcha() {
		if(this.getVelocidade() == 0) {
			this.setMarchaAtual(0);
		}else if(this.getVelocidade() <21) {		
			this.setMarchaAtual(1);
		}else if(this.getVelocidade() < 36) {
			this.setMarchaAtual(2);
		}else if(this.getVelocidade() < 51) {
			this.setMarchaAtual(3);
		}else if(this.getVelocidade() < 66) {
			this.setMarchaAtual(4);
		}else if(this.getVelocidade() < 110) {
			this.setMarchaAtual(5);
		}				
	}
	@Override
	public void virarDireção(String virou){
		switch (virou) {
		case "Direita":
			this.setVirouPara("Direita");
			break;
		case "Esquerda":
			this.setVirouPara("Esquerda");
			break;	
		default:
			this.setVirouPara("Não Virou");
			break;
		}
		
	}

	@Override
	public String toString() {
		return "Carro [ ligarCarro= " + ligarCarro + ", andando= " + andando + " velocidade= " + velocidade + ", marchaAtual= "
				+ marchaAtual +  ", virouPara= " + virouPara
				+ "]";
	}
	
	

}
