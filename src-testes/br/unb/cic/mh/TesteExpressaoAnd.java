package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoAnd {

	@Test
	public void testAndSimples1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoAnd and = new ExpressaoAnd(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndSimples2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoAnd and = new ExpressaoAnd(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testAndSimples3() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoAnd and = new ExpressaoAnd(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testAndSimples4() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoAnd and = new ExpressaoAnd(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testAndComplexa1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		ValorBooleano C = new ValorBooleano(true);
		
		ExpressaoAnd and1 = new ExpressaoAnd (A, B);
		ExpressaoAnd and2 = new ExpressaoAnd (and1, C);
		
		ValorBooleano res = (ValorBooleano)and2.avaliar();
		
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testAndComplexa2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		ValorBooleano C = new ValorBooleano(true);
		
		ExpressaoAnd and1 = new ExpressaoAnd (A, B);
		ExpressaoAnd and2 = new ExpressaoAnd (and1, C);
		
		ValorBooleano res = (ValorBooleano)and2.avaliar();
		
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testAndComplexa3() {
		ValorBooleano A  = new ValorBooleano(false);
		ValorBooleano B = new ValorBooleano(false);
		ValorBooleano C = new ValorBooleano(false);
		
		ExpressaoAnd and1 = new ExpressaoAnd (A, B);
		ExpressaoAnd and2 = new ExpressaoAnd (and1, C);
		
		ValorBooleano res = (ValorBooleano)and2.avaliar();
		
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}
