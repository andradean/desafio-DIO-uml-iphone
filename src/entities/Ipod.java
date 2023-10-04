package entities;

public class Ipod implements ReprodutorMusical{

	@Override
	public void tocar() {
		System.out.println("Tocando musica!");
		
	}

	@Override
	public void pausa() {
		System.out.println("Pausando musica!");
		
	}

	@Override
	public void selecionarMusica() {
		System.out.println("Selecionando musica!");
		
	}

}
