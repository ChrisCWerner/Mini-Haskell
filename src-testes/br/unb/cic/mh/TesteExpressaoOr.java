package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoOr {

	@Test
	public void testOrSimples1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoOr or = new ExpressaoOr(A, B);
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndSimples2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoOr or = new ExpressaoOr(A, B);
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndSimples3() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoOr or = new ExpressaoOr(A, B);
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndSimples4() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoOr or = new ExpressaoOr(A, B);
		
		ValorBooleano res = (ValorBooleano)or.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testAndComplexa1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		ValorBooleano C = new ValorBooleano(true);
		
		ExpressaoOr or1 = new ExpressaoOr (A, B);
		ExpressaoOr or2 = new ExpressaoOr (or1, C);
		
		ValorBooleano res = (ValorBooleano)or2.avaliar();
		
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndComplexa2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		ValorBooleano C = new ValorBooleano(true);
		
		ExpressaoOr or1 = new ExpressaoOr (A, B);
		ExpressaoOr or2 = new ExpressaoOr (or1, C);
		
		ValorBooleano res = (ValorBooleano)or2.avaliar();
		
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndComplexa3() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(false);
		ValorBooleano C = new ValorBooleano(false);
		
		ExpressaoOr or1 = new ExpressaoOr (A, B);
		ExpressaoOr or2 = new ExpressaoOr (or1, C);
		
		ValorBooleano res = (ValorBooleano)or2.avaliar();
		
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}
