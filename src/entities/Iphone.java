package entities;

public class Iphone implements AparelhoTelefonico, NavegadorWeb, ReprodutorMusical {

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


	@Override
	public void exibirPagina() {
		System.out.println("exbindo pagina!");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("adicionando nova aba!");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("atualizando pagina!");
		
	}

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
