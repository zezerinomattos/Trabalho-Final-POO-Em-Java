package trabalhocarros;

public class PilotarCarro {
	private AndarCarro motorista;
	private Meriva veiculoCar;
//	private S_10 veiculoCam;
	
	public PilotarCarro( Meriva veiculoCar, AndarCarro motorista) {
	super();
	this.motorista = motorista;
	this.veiculoCar = veiculoCar;
	}

	public AndarCarro getMotorista() {
		return motorista;
	}
	public void setMotorista(AndarCarro motorista) {
		this.motorista = motorista;
	}
	public Meriva getVeiculoCar() {
		return veiculoCar;
	}
	public void setVeiculoCar(Meriva veiculoCar) {
		this.veiculoCar = veiculoCar;
	}

	@Override
	public String toString() {
		return "PilotarCarro [motorista=" + motorista + ", veiculoCar=" + veiculoCar + "]";
	}
	
}
