package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

/**
 * Classe que manipula listas. Dentre os m�todos criados,
 * temos m�todos para adicionar, remover
 * @author Christian
 *
 */
public class Lista implements Expressao {

	private ValorLista lista;
	private int size;
	
	/**
	 * Construtor que inicia uma lista vazia de tamanho 0.
	 */
	public Lista() {
		lista = new ValorListaVazia();
		setSize(0);
	}
	
	/**
	 * Construtor que inicia uma lista j� existente do
	 * tamanho da lista.
	 * 
	 * @param lista Valor lista que ser� manipulado.
	 */
	public Lista(ValorLista lista) {
		this.lista = lista;
		setSize(getSize(lista));
	}
	
	/**
	 * Chama o m�todo public Tipo add(ValorConcreto valor, int
	 * index), onde o novo valor vai ser adicionado no topo da
	 * pilha e vai ter como �ndice o tamanho da lista antes da
	 * adi��o ao topo da pilha. 
	 * 
	 * @param valor O valor concreto que ser� adicionado na
	 * 				na lista.
	 * 
	 * @return Retorna o tipo dos elementos listados. Caso
	 * 		   o valor adicionado n�o corresponda ao tipo
	 * 		   dos elementos j� presentes na lista, esse
	 * 		   m�todo retorna o tipo ERRO.
	 */
	public Tipo add(ValorConcreto valor) {
		return add(valor, size);
	}
	
	/**
	 * M�todo que adiciona um valor concreto na lista. Este
	 * m�todo n�o permite adicionar elementos de um tipo
	 * diferente do que j� tem na lista.
	 * 
	 * @param valor O valor concreto que ser� adicionado na
	 * 				na lista.
	 * 
	 * @param index O �ndice no qual o novo vetor vai ser
	 * 				alocado. Elementos anteriores a ele 
	 * 				ser�o deslocados de 1.
	 * 
	 * @return Retorna o tipo dos elementos listados. Caso
	 * 		   o valor adicionado n�o corresponda ao tipo
	 * 		   dos elementos j� presentes na lista, esse
	 * 		   m�todo retorna o tipo ERRO.
	 */
	public Tipo add(ValorConcreto valor, int index) {
		if(!checarTipo(valor))
			return Tipo.ERRO;
		
		if(index < 0)
			index = 0;
		if(index >= getSize()) {
			index = getSize();
			lista = new ValorListaNaoVazia(valor, lista);
			lista.setIndex(index);
		}
		else {
			ValorListaNaoVazia aux1;
			ValorListaNaoVazia aux2;

			aux1 = (ValorListaNaoVazia) find(index);
			aux2 = new ValorListaNaoVazia(valor, aux1.getValorLista());
			aux1.setValorLista(aux2);
			shiftIndex(1, aux2.getIndex());
			aux2.setIndex(index);
		}
		
		size++;
		return valor.tipo();
	}
	
	/**
	 * Retorna o primeiro elemento da lista. Se a lista estiver
	 * vazia, retorna a pr�pria lista vazia (ValorListaVazia)
	 * 
	 * @return O primeiro elemento da lista.
	 */
	public ValorConcreto returnFirstElement() {
		if(lista.isVazia())
			return lista;
		return ((ValorListaNaoVazia) lista).getValorConcreto();
	}
	
	/**
	 * Procura pelo elemento de �ndice index e retorna null
	 * caso o index extrapole os limites da lista.
	 * 
	 * @param index O �ndice a ser procurado.
	 * 
	 * @return O elemento do tipo ValorLista correspondente ao
	 * 		   �ndice ou null caso index extrapole os limites
	 * 		   da lista.
	 */
	public ValorLista find(int index) {
		
		if(index > getSize() || index < 0) {
			return null;
		}
		
		ValorListaNaoVazia aux = (ValorListaNaoVazia) lista;
		
		while(aux.getIndex() != index) {
			aux = (ValorListaNaoVazia) aux.getValorLista();
		}

		return aux;
	}
	
	/**
	 * Procura pelo primeiro elemento da lista com ValorConcreto
	 * valor a partir do topo da lista.
	 * 
	 * @param valor O valor concreto a ser procurado.
	 * 
	 * @return O primeiro elemento do tipo ValorLista
	 * 		   correspondente ao valor ou null caso o elemento
	 * 		   n�o esteja presente.
	 */
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
	
	/**
	 * Remove o elemento de �ndice index.
	 * 
	 * @param index O �ndice do elemento a ser removido.
	 * 
	 * @return O elemento removido ou null, caso o elemento n�o
	 * 		   esteja presente.
	 */
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

	/**
	 * Desloca os �ndices da lista do topo at� o elemento de
	 * �ndice index de um valor shift (normalmente 1, quando um
	 * elemento � adicionado, ou -1, quando um elemento � removido)
	 * 
	 * @param shift O valor de deslocamento at� o �ndice index.
	 * 				Normalmente assume valores de 1, para quando um
	 * 				elemento � acrescido � lista, e -1, para quando
	 * 				um elemento � removido da lista.
	 *  
	 * @param index O �ndice que marca at� onde o deslocamento vai
	 * 				ocorrer. O deslocamento ocorre do topo at� o
	 * 				fundo.
	 */
	private void shiftIndex(int shift, int index) {
		ValorListaNaoVazia aux = (ValorListaNaoVazia) lista;

		while(aux.getIndex() != index) {
			aux.setIndex(aux.getIndex() + shift);
			aux = (ValorListaNaoVazia) aux.getValorLista();
		}
		if(shift > 0) {
			aux.setIndex(shift);
		}
	}
	
	/**
	 * Printa em console a lista, chamando a fun��o private void
	 * print(ValorLista aux).
	 */
	public void print() {
		print(lista);
		System.out.println();
	}
	
	/**
	 * Percorre a lista recursivamente, com o fim de imprimir em
	 * console a lista com os valores do fundo ao topo.
	 * 
	 * @param aux O pr�ximo elemento da lista a ser percorrido.
	 */
	private void print(ValorLista aux) {
		if(!aux.isVazia()) {
			print(((ValorListaNaoVazia) aux).getValorLista());
			System.out.println(aux.getIndex() + " - " + ((ValorListaNaoVazia) aux).getValorConcreto().getValor());
		}
	}
	
	/**
	 * Percorre a lista � procura do tamanho total dela. �
	 * utilizada quando a lista j� foi iniciada.
	 * 
	 * @param lista Lista que vai ter o tamanho contado.
	 * 
	 * @return O tamanho total da lista.
	 */
	private int getSize(ValorLista lista) {
		ValorLista aux = lista;
		int size = 0;
		while(!aux.isVazia()){
			aux = ((ValorListaNaoVazia) aux).getValorLista();
			size++;
		}
		return size;
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

	/**
	 * Retorna o tipo do primeiro elemento da lista ou ERRO
	 * quando os dois primeiros elementos n�o coincidem em tipo.
	 */
	@Override
	public Tipo tipo() {
		if(checarTipo())
			return returnFirstElement().tipo();
		return Tipo.ERRO;
	}

	/**
	 * Verifica se a tipagem da lista bate.
	 */
	@Override
	public boolean checarTipo() {
		if(getSize() < 2)
			return true;
		
		ValorListaNaoVazia  v1 = (ValorListaNaoVazia) lista,
							v2 = (ValorListaNaoVazia) v1.getValorLista();
		return v1.getValorConcreto().tipo() == v2.getValorConcreto().tipo();
	}
	
	private boolean checarTipo(ValorConcreto valor) {
		return returnFirstElement().tipo() == valor.tipo() ^
				returnFirstElement().tipo() == Tipo.LISTA_VAZIA;
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
