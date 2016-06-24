package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoMaiorQue extends ExpressaoIgualdade{

	public ExpressaoMaiorQue(Expressao s1, Expressao s2) {
		super(s1, s2);
		// TODO Auto-generated constructor stub
	}
	/*
	 * Retorna um valor true se v1 for maior que v2;
	 */
	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro)sub1.avaliar();
		ValorInteiro v2 = (ValorInteiro)sub2.avaliar();
		
		if (v1.getValor() > v2.getValor()){
			return new ValorBooleano(true);
		}else{
			return new ValorBooleano(false);
		}
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
