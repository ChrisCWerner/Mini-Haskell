package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public abstract class ValorLista extends ValorConcreto<ValorLista> {

	public ValorLista(ValorLista valor) {
		super(valor);
	}

	@Override
	public Tipo tipo() {
		return Tipo.LISTA;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	
}
