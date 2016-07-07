package br.unb.cic.mh;

public class ValorListaNaoVazia extends ValorLista {

	private ValorConcreto valorConcreto;
	private ValorLista valorLista;
	
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

	public void setValorLista(ValorLista valorLista) {
		this.valorLista = valorLista;
	}	
	

}
