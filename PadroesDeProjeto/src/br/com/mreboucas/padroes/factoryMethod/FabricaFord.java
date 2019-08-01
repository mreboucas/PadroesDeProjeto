package br.com.mreboucas.padroes.factoryMethod;

public class FabricaFord implements FabricaDeCarro {

	@Override
	public Carro criarCarro() {
		return new Fiesta();
	}

}