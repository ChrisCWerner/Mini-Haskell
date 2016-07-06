package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ValorLista extends ValorConcreto<ValorLista> {

	protected int index;
	
	public ValorLista(ValorLista lista) {
		super(lista);
	}

	@Override
	public Tipo tipo() {
		return Tipo.LISTA;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	
	public boolean isListaVazia(){
		return this instanceof ValorListaVazia;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
}
