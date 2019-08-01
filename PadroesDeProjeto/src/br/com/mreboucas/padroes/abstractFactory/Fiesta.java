package br.com.mreboucas.padroes.abstractFactory;

public class Fiesta implements CarroPopular {

	@Override
	public void exibirInfoPopular() {
		System.out.println("Modelo: Fiesta\nF�brica: Ford\nCategoria:Popular");
	}

}
