package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoDiferenca {

	@Test
	public void testDiferen�aSimples1() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(true);
		
		ExpressaoDiferenca and = new ExpressaoDiferenca(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}
	
	@Test
	public void testDiferen�aSimples2() {
		ValorBooleano A  = new ValorBooleano(true);
		ValorBooleano B = new ValorBooleano(false);
		
		ExpressaoDiferenca and = new ExpressaoDiferenca(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testDiferen�aSimples3() {
		ValorInteiro A  = new ValorInteiro(13);
		ValorInteiro B = new ValorInteiro(5);
		
		ExpressaoDiferenca and = new ExpressaoDiferenca(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(true), res.getValor());
	}
	
	@Test
	public void testDiferen�aSimples4() {
		ValorInteiro A  = new ValorInteiro(13);
		ValorInteiro B = new ValorInteiro(13);
		
		ExpressaoDiferenca and = new ExpressaoDiferenca(A, B);
		
		ValorBooleano res = (ValorBooleano)and.avaliar();
		Assert.assertEquals(new Boolean(false), res.getValor());
	}

}
