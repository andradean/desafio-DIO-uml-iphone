package entities;

public class Computador implements NavegadorWeb {

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

}
