package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMultiplica {

	@Test
	public void testMutiplicacaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoSoma multiplicacao = new ExpressaoMultiplica(v5, v10);
		
		ValorInteiro res = (ValorInteiro)multiplicacao.avaliar();
		Assert.assertEquals(new Integer(50), res.getValor());
	}
	
	@Test
	public void testMultiplicacaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v20 = new ValorInteiro(20);
		
		ExpressaoSoma m1 = new ExpressaoMultiplica(v5, v10);
		ExpressaoSoma m2 = new ExpressaoMultiplica(m1, v20);
		
		ValorInteiro res = (ValorInteiro)m2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(1000), res);
	}

}
