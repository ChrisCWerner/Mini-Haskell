package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoIgualdade extends ExpressaoBinaria{

	public ExpressaoIgualdade(Expressao s1, Expressao s2) {
		super(s1, s2);
	}
	
	@Override
	public Valor avaliar() {
		
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		//caso for um inteiro
		if(t1.equals(Tipo.INTEIRO) && t2.equals(Tipo.INTEIRO)){
			
			ValorInteiro v1 = (ValorInteiro)sub1.avaliar();
			ValorInteiro v2 = (ValorInteiro)sub2.avaliar();
			
			if (v1.equals(v2) == true){
				return new ValorBooleano(true);
			}else{
				return new ValorBooleano(false);
			}
		}
		//caso for booleano
		ValorBooleano v1 = (ValorBooleano)sub1.avaliar();
		ValorBooleano v2 = (ValorBooleano)sub2.avaliar();
			
		if (v1.equals(v2))
			return new ValorBooleano (true);
		else
			return new ValorBooleano (false);
	}

	@Override
	public Tipo tipo() {
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		
		if(t1.equals(Tipo.INTEIRO) && t2.equals(Tipo.INTEIRO)) {
			return Tipo.BOOLEANO;
		}
		else if (t1.equals(Tipo.BOOLEANO) && t2.equals(Tipo.BOOLEANO)){
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
