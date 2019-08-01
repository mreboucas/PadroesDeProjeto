package br.com.mreboucas.padroes.iteratorInterno;

import br.com.mreboucas.padroes.iteratorExterno.Canal;
import br.com.mreboucas.padroes.iteratorExterno.IteradorInterface;

public abstract class IteradorInterno {

	IteradorInterface it;

	public void percorrerLista() {
		for (it.first(); !it.isDone(); it.next()) {
			operacao(it.currentItem());
		}
	}

	protected abstract void operacao(Canal canal);
}
