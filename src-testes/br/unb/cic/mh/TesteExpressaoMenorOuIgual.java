package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMenorOuIgual {

	@Test
	public void testMenorOuIgualSimples1() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMenorOuIgual m = new ExpressaoMenorOuIgual(v5, v10);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testMenorOuIgualSimples2() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMenorOuIgual m = new ExpressaoMenorOuIgual(v10, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testMenorOuIgualSimples3() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		ExpressaoMenorOuIgual m = new ExpressaoMenorOuIgual(v5, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
}
