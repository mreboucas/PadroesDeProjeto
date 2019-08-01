package br.com.mreboucas.padroes.iteratorInterno;

import br.com.mreboucas.padroes.iteratorExterno.Canal;
import br.com.mreboucas.padroes.iteratorExterno.IteradorInterface;

public class IteradorPrint extends IteradorInterno {

	public IteradorPrint(IteradorInterface it) {
		this.it = it;
	}

	@Override
	protected void operacao(Canal canal) {
		System.out.println(canal.nome);
	}

}
