package entities;

public class TelFixo implements AparelhoTelefonico{

	@Override
	public void ligar() {
		System.out.println("ligando para alguem!");
		
	}

	@Override
	public void atender() {
		System.out.println("atendendo para alguem!");
		
	}

	@Override
	public void iniciarCorreioDeVoz() {
		System.out.println("iniciando correio de voz");
		
	}

}
