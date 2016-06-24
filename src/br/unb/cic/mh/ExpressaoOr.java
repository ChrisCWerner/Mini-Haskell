package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoOr extends ExpressaoAnd{

	public ExpressaoOr(Expressao s1, Expressao s2) {
		super(s1, s2);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano)sub1.avaliar();
		ValorBooleano v2 = (ValorBooleano)sub2.avaliar();
		
		if (v1.getValor() == false && v2.getValor() == false)
			return new ValorBooleano (false);
		else
			return new ValorBooleano (true);
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
	

}
