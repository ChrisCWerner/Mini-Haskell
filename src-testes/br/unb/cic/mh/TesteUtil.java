package br.unb.cic.mh;


public abstract class TesteUtil {
	public ExpressaoSoma soma(Expressao exp1, Expressao exp2) {
		return new ExpressaoSoma(exp1, exp2);
	}
	
	public ExpressaoSubtrai subtracao(Expressao exp1, Expressao exp2) {
		return new ExpressaoSubtrai(exp1, exp2);
	}
	
	public ExpressaoMultiplica multiplicacao(Expressao exp1, Expressao exp2) {
		return new ExpressaoMultiplica(exp1, exp2);
	}
	
	public ExpressaoDivide divisao(Expressao exp1, Expressao exp2) {
		return new ExpressaoDivide(exp1, exp2);
	}
	
	public ExpressaoRefId ref(String id) {
		return new ExpressaoRefId(id);
	}
	
	public ValorInteiro vi(Integer valor) {
		return new ValorInteiro(valor);
	}
}
