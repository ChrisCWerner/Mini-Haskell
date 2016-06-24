package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoIgualdade {

	@Test
	public void testIgualdadeSimples1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoIgualdade and = new ExpressaoIgualdade(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testIgualdadeSimples2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoIgualdade and = new ExpressaoIgualdade(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testIgualdadeSimples3() {
		ValorInteiro A  = new ValorInteiro(13);
		ValorInteiro B = new ValorInteiro(13);
		
		ExpressaoIgualdade and = new ExpressaoIgualdade(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testIgualdadeSimples4() {
		ValorInteiro A  = new ValorInteiro(13);
		ValorInteiro B = new ValorInteiro(0);
		
		ExpressaoIgualdade and = new ExpressaoIgualdade(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}
