package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoSubtrai {

	@Test
	public void testSubtracaoSimples() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		
		ExpressaoSubtrai subtrai = new ExpressaoSubtrai(v10, v5);
		
		ValorInteiro res = (ValorInteiro)subtrai.avaliar();
		Assert.assertEquals(new Integer(5), res.getValor());
	}
	
	@Test
	public void testSubtracaoComplexa() {
		ValorInteiro v5  = new ValorInteiro(5);
		ValorInteiro v10 = new ValorInteiro(10);
		ValorInteiro v20 = new ValorInteiro(20);
		
		ExpressaoSubtrai subtrai1 = new ExpressaoSubtrai(v10, v5);
		ExpressaoSubtrai subtrai2 = new ExpressaoSubtrai(v20,subtrai1);
		
		ValorInteiro res = (ValorInteiro)subtrai2.avaliar();
		
		Assert.assertEquals(new ValorInteiro(15), res);
	}

}
