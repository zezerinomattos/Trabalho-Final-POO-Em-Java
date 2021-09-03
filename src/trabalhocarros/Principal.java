package trabalhocarros;

public class Principal {

	public static void main(String[] args) {
		AndarCarro a1 = new AndarCarro();
		a1.setLigarCarro(true);
		a1.setAndando(true);
		a1.acelerar();
		a1.acelerar();
		a1.acelerar();
		a1.frear();
		a1.acelerar();
		a1.acelerar();
		a1.acelerar();
		a1.mudarMarcha();
		a1.setVirouPara("Direita");
//		System.out.println(a1.toString());
		
		
		Carro c = new Carro("bbbb", "jjjjj", "ppppp", 2000);
		c.tempoFabricação();
//		System.out.println(c.toString());
		
		Meriva m = new Meriva("Chevrolet", "Meriva", "Carro", 2010, "8V", "Preto");
		m.tempoFabricação();
		m.acelerar();
		m.acelerar();
		m.acelerar();
		m.frear();
//		System.out.println(m.toString());
		
		S_10 cm = new S_10("jskjddshu", "idsuduhdu", "isiijid", 2002, "16V", "Prata");
		cm.tracao();
		cm.tempoFabricação();
//		System.out.println(cm.toString());
		
		PilotarCarro pi = new PilotarCarro(m, a1);
		System.out.println(pi.toString());
		
		
	}

}
