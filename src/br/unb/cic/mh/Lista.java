package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class Lista implements Expressao {

	private ValorLista lista;
	
	public Lista() {
		lista = new ValorListaVazia();
	}
	
	public Lista(ValorLista lista){
		this.lista = lista;
	}

	@Override
	public Tipo tipo() {
		
		return null;
	}

	@Override
	public boolean checarTipo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Valor avaliar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void aceitar(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
