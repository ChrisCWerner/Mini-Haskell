package br.unb.cic.mh;

public class ValorListaVazia extends ValorLista {

	static ValorListaVazia listaVazia;
	
	public ValorListaVazia(){
		super(listaVazia);
	}
	
	@Override
	public Tipo tipo(){
		return Tipo.LISTA_VAZIA;
	}
}
