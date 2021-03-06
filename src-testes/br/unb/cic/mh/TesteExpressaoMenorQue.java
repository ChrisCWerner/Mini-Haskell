package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMenorQue {

	@Test
	public void testMenorQueSimples1() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMenorQue m = new ExpressaoMenorQue(v5, v10);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testMenorQueSimples2() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMenorQue m = new ExpressaoMenorQue(v10, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testMenorQueSimples3() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		ExpressaoMenorQue m = new ExpressaoMenorQue(v5, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
}
