package br.unb.cic.mh;

import br.unb.cic.mh.visitor.Visitor;

public class ExpressaoDiferenca extends ExpressaoIgualdade{

	public ExpressaoDiferenca(Expressao s1, Expressao s2) {
		super(s1, s2);
	}
	
	@Override
	public Valor avaliar() {
		
		Tipo t1 = sub1.tipo();
		Tipo t2 = sub2.tipo();
		
		if(t1.equals(Tipo.INTEIRO) && t2.equals(Tipo.INTEIRO)){
			
			ValorInteiro v1 = (ValorInteiro)sub1.avaliar();
			ValorInteiro v2 = (ValorInteiro)sub2.avaliar();
			
			if (v1.equals(v2) == false){
				return new ValorBooleano(true);//retorna verdadeiro se for dirente
			}else{
				return new ValorBooleano(false);
			}
		}

		ValorBooleano v1 = (ValorBooleano)sub1.avaliar();
		ValorBooleano v2 = (ValorBooleano)sub2.avaliar();
			
		if (v1.equals(v2) == false)
			return new ValorBooleano (true);//retorna verdadeiro se for dirente
		else
			return new ValorBooleano (false);
	}
	
	@Override
	public void aceitar(Visitor v) {
		v.visitar(this);
	}

}
