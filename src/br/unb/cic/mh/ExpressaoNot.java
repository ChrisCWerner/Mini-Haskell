package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoNot extends ExpressaoUnaria{

	public ExpressaoNot(Expressao sub1) {
		super(sub1);
	}
	
	@Override
	public Valor avaliar() {
		
		ValorBooleano v1 = (ValorBooleano)sub1.avaliar();
		
		if (v1.getValor() == true)
			return new ValorBooleano (false);
		else
			return new ValorBooleano (true);
	}

	@Override
	public Tipo tipo() {
		
		Tipo t1 = sub1.tipo();
		
		if(t1.equals(Tipo.BOOLEANO)) {
			return Tipo.BOOLEANO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.BOOLEANO);
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
