package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoFatorial extends ExpressaoUnaria{

	public ExpressaoFatorial(Expressao sub1) {
		super(sub1);
	}
	@Override
	public Valor avaliar() {
		ValorInteiro v1 = (ValorInteiro)sub1.avaliar();
		//Calcula a condição da expressao IfThenElse:
		ExpressaoIgualdade aux = new ExpressaoIgualdade(v1,new ValorInteiro(0));
		ValorBooleano vaux = (ValorBooleano)aux.avaliar();
		//Calcula o proximo termo (n - 1) do fatorial de n:
		ExpressaoSubtrai sub2 = new ExpressaoSubtrai (v1, new ValorInteiro(1));
		ValorInteiro v2 = (ValorInteiro)sub2.avaliar();
		//Faz a multiplicação:
		ExpressaoMultiplica sub3 = new ExpressaoMultiplica(v1,new ExpressaoFatorial(v2));
		ExpressaoIfThenElse sub4 = new ExpressaoIfThenElse(vaux, new ValorInteiro(1),sub3);
		ValorInteiro v4 = (ValorInteiro)sub4.avaliar();
		return v4;
	}
	@Override
	public Tipo tipo() {
		
		Tipo t1 = sub1.tipo();
		
		if(t1.equals(Tipo.INTEIRO)) {
			return Tipo.INTEIRO;
		}
		return Tipo.ERRO;
	}

	@Override
	public boolean checarTipo() {
		return tipo().equals(Tipo.INTEIRO);
	}

	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}
}
