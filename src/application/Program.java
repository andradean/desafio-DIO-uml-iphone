package application;

import entities.Computador;
import entities.Iphone;
import entities.Ipod;
import entities.TelFixo;

public class Program {
	public static void main(String[] args) {
		Computador computador = new Computador();
		System.out.println("COMPUTADOR: ");
		computador.adicionarNovaAba();
		computador.atualizarPagina();
		computador.exibirPagina();
		System.out.println("-----------------------------");

		Ipod ipod = new Ipod();
		System.out.println("IPOD: ");
		ipod.pausa();
		ipod.selecionarMusica();
		;
		ipod.tocar();
		System.out.println("-----------------------------");

		TelFixo telFixo = new TelFixo();
		System.out.println("TEL FIXO: ");
		telFixo.atender();
		telFixo.ligar();
		telFixo.iniciarCorreioDeVoz();
		System.out.println("-----------------------------");

		Iphone iphone = new Iphone();
		System.out.println("IPHONE:");
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		iphone.exibirPagina();
		iphone.pausa();
		iphone.selecionarMusica();
		;
		iphone.tocar();
		iphone.atender();
		iphone.ligar();
		iphone.iniciarCorreioDeVoz();

	}
}
