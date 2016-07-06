package br.unb.cic.mh;

import java.util.Scanner;

import org.junit.Assert;

import org.junit.Test;


public class TesteLista {
	
	@Test
	public void testeCriaLista() {

		ValorLista lista = new ValorListaNaoVazia(vi(4), new ValorListaVazia());
		Assert.assertEquals(vi(4), ((ValorListaNaoVazia) lista).getValorConcreto());

		Assert.assertEquals(false, lista.isListaVazia());

		Assert.assertEquals(true, (new ValorListaVazia()).isListaVazia());

		Assert.assertEquals(true, ((ValorListaNaoVazia) lista).getValorLista().isListaVazia());
	}

	
	
	
	
	public ValorInteiro vi(int valor) {
		return new ValorInteiro(valor);
	}
}
