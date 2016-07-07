package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoFatorial {

	@Test
	public void testFatorial5() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		ExpressaoFatorial fat5 = new ExpressaoFatorial(v5);
		
		ValorInteiro res = (ValorInteiro)fat5.avaliar();
		Assert.assertEquals(new Integer(120), res.getValor());
	}
	
	@Test
	public void testFatorial() {
		ValorInteiro v6  = new ValorInteiro(6);
		
		ExpressaoFatorial fat6 = new ExpressaoFatorial(v6);
		
		ValorInteiro res = (ValorInteiro)fat6.avaliar();
		Assert.assertEquals(new Integer(720), res.getValor());
	}
	@Test
	public void testFatorial1() {
		ValorInteiro v0  = new ValorInteiro(0);
		
		ExpressaoFatorial fat0 = new ExpressaoFatorial(v0);
		
		ValorInteiro res = (ValorInteiro)fat0.avaliar();
		Assert.assertEquals(new Integer(1), res.getValor());
	}
	@Test
	public void testFatorial2() {
		ValorInteiro v1  = new ValorInteiro(1);
		
		ExpressaoFatorial fat1 = new ExpressaoFatorial(v1);
		
		ValorInteiro res = (ValorInteiro)fat1.avaliar();
		Assert.assertEquals(new Integer(1), res.getValor());
	}
	@Test
	public void testFatorial3() {
		ValorInteiro v10  = new ValorInteiro(10);
		
		ExpressaoFatorial fat10 = new ExpressaoFatorial(v10);
		
		ValorInteiro res = (ValorInteiro)fat10.avaliar();
		Assert.assertEquals(new Integer(3628800), res.getValor());
	}

}
