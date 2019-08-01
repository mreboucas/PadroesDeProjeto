package br.com.mreboucas.padroes.state;

public interface MarioState {
	MarioState pegarCogumelo();

	MarioState pegarFlor();

	MarioState pegarPena();

	MarioState levarDano();
}
