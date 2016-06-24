package br.unb.cic.mh;

public class ValorListaNaoVazia extends ValorLista {

	protected ValorConcreto valorConcreto;
	
	public ValorListaNaoVazia(ValorConcreto valorConcreto, ValorLista valorLista){
		super(valorLista);
		this.valorConcreto = valorConcreto;
	}
	
}
