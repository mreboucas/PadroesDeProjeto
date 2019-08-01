package br.com.mreboucas.padroes.abstractFactory;

public interface FabricaDeCarro {
	CarroSedan criarCarroSedan();
	CarroPopular criarCarroPopular();
}
