package br.unb.cic.mh;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.Assert;

public class TesteExpressaoAplicacao extends TesteUtil {

	@Test
	public void testeFuncaoIncrementa() {
		DeclFuncao inc = (new DeclFuncao()).nome("inc")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(soma(ref("x"), vi(1)));
		
		AmbienteExecucao.instance().declararFuncao(inc);
		
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("inc").parametro(soma(vi(3), vi(2)));
		
		Assert.assertEquals(new ValorInteiro(6), ap.avaliar());
	}
	@Test
	public void testeFuncaoDecrementa() {
		DeclFuncao dec = (new DeclFuncao()).nome("dec")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(subtracao(ref("x"), vi(1)));
		
		AmbienteExecucao.instance().declararFuncao(dec);
		
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("dec").parametro(subtracao(vi(3), vi(2)));
		
		Assert.assertEquals(new ValorInteiro(0), ap.avaliar());
	}
	@Test
	public void testeFuncaoMultiplicacao() {
		DeclFuncao mult = (new DeclFuncao()).nome("mult")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(multiplicacao(ref("x"), vi(2)));
		
		AmbienteExecucao.instance().declararFuncao(mult);
		
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("mult").parametro(multiplicacao(vi(3), vi(3)));
		
		Assert.assertEquals(new ValorInteiro(18), ap.avaliar());
	}
	@Test
	public void testeFuncaoDivisao() {
		DeclFuncao div = (new DeclFuncao()).nome("div")
				.argumento(new ArgumentoFormal("x", Tipo.INTEIRO))
				.corpo(divisao(ref("x"), vi(3)));
		
		AmbienteExecucao.instance().declararFuncao(div);
		
		ExpressaoAplicacao ap = (new ExpressaoAplicacao())
				.nome("div").parametro(divisao(vi(81), vi(3)));
		
		Assert.assertEquals(new ValorInteiro(9), ap.avaliar());
	}
}
