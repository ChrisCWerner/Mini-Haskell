package br.unb.cic.mh;

import org.junit.Assert;
import org.junit.Test;


public class TesteLista {
	
	@Test
	public void testeCriaLista() {

		ValorLista lista = new ValorListaNaoVazia(v(4), new ValorListaVazia());
		Assert.assertEquals(v(4), ((ValorListaNaoVazia) lista).getValorConcreto());

		Assert.assertEquals(false, lista.isVazia());

		Assert.assertEquals(true, (new ValorListaVazia()).isVazia());

		Assert.assertEquals(true, ((ValorListaNaoVazia) lista).getValorLista().isVazia());
	}

	@Test
	public void testeAddLista() {
		
		Lista lista = new Lista();
		
		lista.add(v(4));
		
		Assert.assertEquals(1, lista.getSize());
		Assert.assertEquals(v(4), lista.returnFirstElement());
		Assert.assertEquals(0, lista.getIndex());
		
		
		lista.add(v(6));
		
		Assert.assertEquals(2, lista.getSize());
		Assert.assertEquals(v(6), lista.returnFirstElement());
		Assert.assertEquals(1, lista.getIndex());
		
		ValorListaNaoVazia vl = (ValorListaNaoVazia) lista.find(0);
		Assert.assertEquals(v(4), vl.getValorConcreto());
		
		vl = (ValorListaNaoVazia) lista.find(1);
		
		Assert.assertEquals(v(6), vl.getValorConcreto());
		
		
		Assert.assertEquals(null, lista.find(3));
		
		Assert.assertEquals(Tipo.INTEIRO, lista.add(v(7)));
		
		Assert.assertEquals(Tipo.ERRO, lista.add(v(true)));
		Assert.assertEquals(3, lista.getSize());
		Assert.assertEquals(v(7), lista.returnFirstElement());
		Assert.assertEquals(2, lista.getIndex());
		Assert.assertEquals(1, lista.find(v(6)).getIndex());
	}
	
	@Test
	public void testeRemoveLista() {

		Lista lista = new Lista();

		lista.add(v(9));
		lista.add(v(8));
		lista.add(v(7));
		lista.add(v(6));
		lista.add(v(5));
		lista.add(v(4));
		lista.add(v(3));
		
		ValorListaNaoVazia vl = (ValorListaNaoVazia) lista.find(2);

		Assert.assertEquals(7, lista.getSize());
		Assert.assertEquals(7, vl.getValorConcreto().getValor());
		Assert.assertEquals(null, lista.remove(-1));
		Assert.assertEquals(null, lista.remove(8));
		Assert.assertEquals(7, lista.getSize());

		vl = (ValorListaNaoVazia) lista.remove(3);
		
		Assert.assertEquals(v(6), vl.getValorConcreto());
		Assert.assertEquals(6, lista.getSize());
		Assert.assertEquals(v(5), ((ValorListaNaoVazia) lista.find(3)).getValorConcreto());
		lista.print();
		
		
	}
	
	
	
	public ValorBooleano v(boolean valor) {
		return new ValorBooleano(valor);
	}
	
	public ValorInteiro v(int valor) {
		return new ValorInteiro(valor);
	}
}
