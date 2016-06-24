package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoMaiorOuIgual {

	@Test
	public void testMaiorOuIgualSimples1() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMaiorOuIgual m = new ExpressaoMaiorOuIgual(v5, v10);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testMaiorOuIgualSimples2() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoMaiorOuIgual m = new ExpressaoMaiorOuIgual(v10, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testMaiorOuIgualSimples3() {
		ValorInteiro v5  = new ValorInteiro(5);
		
		ExpressaoMaiorOuIgual m = new ExpressaoMaiorOuIgual(v5, v5);
		
		ValorBooleano res = (ValorBooleano)m.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
}
