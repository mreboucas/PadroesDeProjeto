package br.com.mreboucas.padroes.mediator;

public interface Mediator {

	void enviar(String mensagem, Colleague colleague);

}