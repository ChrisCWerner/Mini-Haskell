package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoMultiplica extends ExpressaoSoma{

	public ExpressaoMultiplica(Expressao s1, Expressao s2) {
		super(s1, s2);
	}
	
	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro)sub1.avaliar();
		ValorInteiro v2 = (ValorInteiro)sub2.avaliar();
		
		return new ValorInteiro(v1.getValor() * v2.getValor());
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
