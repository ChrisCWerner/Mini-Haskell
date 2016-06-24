package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaiorQue {

	@Test
	public void testMaiorQueSimples1() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMaiorQue m = new ExpressaoMaiorQue(v5, v10);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testMaiorQueSimples2() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMaiorQue m = new ExpressaoMaiorQue(v10, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testMaiorQueSimples3() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		ExpressaoMaiorQue m = new ExpressaoMaiorQue(v5, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}
