package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDivide {

	@Test
	public void testDivisaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoSoma divisao = new ExpressaoDivide(v10, v5);
		
		ValorInteiro res = (ValorInteiro)divisao.avaliar();
		Assert.assertEquals(new Integer(2), res.getValor());
	}
	
	@Test
	public void testDivisaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v20 = new ValorInteiro(20);
		
		ExpressaoSoma d1 = new ExpressaoDivide(v10, v5);
		ExpressaoSoma d2 = new ExpressaoDivide(v20, d1);
		
		ValorInteiro res = (ValorInteiro)d2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(10), res);
	}

}
