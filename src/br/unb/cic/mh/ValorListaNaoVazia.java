package br.unb.cic.mh;

public class ValorListaNaoVazia extends ValorLista {

	protected ValorConcreto valorConcreto;
	protected ValorLista valorLista;
	
	public ValorListaNaoVazia(ValorConcreto valorConcreto, ValorLista valorLista){
		super(valorLista);
		this.valorConcreto = valorConcreto;
		this.valorLista = valorLista;
	}

	
	public ValorConcreto getValorConcreto() {
		return valorConcreto;
	}

	public ValorLista getValorLista() {
		return valorLista;
	}

}
