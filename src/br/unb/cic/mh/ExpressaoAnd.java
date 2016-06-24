package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoAnd extends ExpressaoBinaria{

	public ExpressaoAnd(Expressao s1, Expressao s2) {
		super(s1, s2);
	}
	
	@Override
	public Valor avaliar() {
		ValorBooleano v1 = (ValorBooleano)sub1.avaliar();
		ValorBooleano v2 = (ValorBooleano)sub2.avaliar();
		
		if (v1.getValor() == true && v2.getValor() == true)
			return new ValorBooleano (true);
		else
			return new ValorBooleano (false);
	}

	@Override
	public Tipo tipo() {
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		
		if(t1.equals(Tipo.BOOLEANO) && t2.equals(Tipo.BOOLEANO)) {
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
