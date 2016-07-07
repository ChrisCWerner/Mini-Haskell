package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class Lista implements Expressao {

	private ValorLista lista;
	private int size;
	
	public Lista() {
		lista = new ValorListaVazia();
		setSize(0);
	}
	
	public Lista(ValorLista lista) {
		this.lista = lista;
	}
	
	public Tipo add(ValorConcreto valor) {
		if(!lista.isVazia()) {
			ValorListaNaoVazia vlnv = (ValorListaNaoVazia) lista;
			if(vlnv.getValorConcreto().tipo() != valor.tipo()){
				return Tipo.ERRO;
			}
		}
		lista = new ValorListaNaoVazia(valor, lista);
		lista.setIndex(size);
		size++;
		return valor.tipo();
	}
	
	public Valor returnFirstElement() {
		if(lista.isVazia())
			return lista;
		return ((ValorListaNaoVazia) lista).getValorConcreto();
	}
	
	public ValorLista find(int index) {
		
		if(index >= getSize() || index < 0) {
			return null;
		}
		
		ValorListaNaoVazia aux = (ValorListaNaoVazia) lista;
		
		while(aux.getIndex() != index) {
			aux = (ValorListaNaoVazia) aux.getValorLista();
		}

		return aux;
	}
	
	public ValorLista find(ValorConcreto valor) {
		
		ValorListaNaoVazia aux = (ValorListaNaoVazia) lista;
		
		while(aux.getValorConcreto().getValor() != valor.getValor()) {
			if(aux.getValorLista().isVazia())
				return null;
			else
				aux = (ValorListaNaoVazia) aux.getValorLista();
		}
		
		return aux;
	}
	
	public ValorLista remove(int index) {
		ValorLista aux = find(index);
		
		if(index+1 == getSize()) {
			aux = ((ValorListaNaoVazia) aux).getValorLista();
			size--;
		}
		else if(aux != null) {
			ValorListaNaoVazia aux2 = (ValorListaNaoVazia) find(index+1);
			shiftIndex(-1, aux.getIndex());
			aux2.setValorLista(((ValorListaNaoVazia) aux).getValorLista());
			size--;
		}
		
		return aux;
	}

	private void shiftIndex(int shift, int index) {
		ValorListaNaoVazia aux = (ValorListaNaoVazia) lista;

		while(aux.getIndex() != index) {
			aux.setIndex(aux.getIndex() + shift);
			aux = (ValorListaNaoVazia) aux.getValorLista();
		}
	}
	
	public void print() {
		print(lista);
	}
	
	private void print(ValorLista aux) {
		if(!aux.isVazia()) {
			print(((ValorListaNaoVazia) aux).getValorLista());
			System.out.println(aux.getIndex() + " - " + ((ValorListaNaoVazia) aux).getValorConcreto().getValor());
		}
	}
	
	public int getSize() {
		return size;
	}
	
	public int getIndex(){
		return lista.getIndex();
	}
	
	private void setSize(int size){
		this.size = size;
	}

	@Override
	public Tipo tipo() {
		return returnFirstElement().tipo();
	}

	@Override
	public boolean checarTipo() {
		if(getSize() < 2)
			return true;
		
		ValorListaNaoVazia  v1 = (ValorListaNaoVazia) lista,
							v2 = (ValorListaNaoVazia) v1.getValorLista();
		return v1.getValorConcreto().tipo() == v2.getValorConcreto().tipo();
	}

	@Override
	public Valor avaliar() {
		return lista;
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
