package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoNot {

	@Test
	public void testNotSimples1() {
		ValorBooleano A  = new ValorBooleano(true);
		
		ExpressaoNot not = new ExpressaoNot(A);
		
		ValorBooleano res = (ValorBooleano)not.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testNotSimples2() {
		ValorBooleano A  = new ValorBooleano(false);
		
		ExpressaoNot not = new ExpressaoNot(A);
		
		ValorBooleano res = (ValorBooleano)not.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}

}
