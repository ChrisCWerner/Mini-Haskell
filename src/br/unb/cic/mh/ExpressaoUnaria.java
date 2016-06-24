package br.unb.cic.mh;

public abstract class ExpressaoUnaria implements Expressao{
	
	protected Expressao sub1;
	
	public ExpressaoUnaria(Expressao sub1){
		this.sub1 = sub1;
	}
	
	public Expressao getSub1() {
		return sub1;
	}
}
