package br.unb.cic.mh;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TesteExpressaoLet {

	@Test
	public void testeExpressaoLetSimples() {
		// let x = 5
		// in x + x
		ExpressaoLet let1 = new ExpressaoLet("x", new ValorInteiro(5),
				new ExpressaoSoma(new ExpressaoRefId("x"), new ExpressaoRefId("x")));

		assertEquals(new ValorInteiro(10), let1.avaliar());
	}

	@Test
	public void testeExpressaoLetAninhada() {
		//let x = 5 in x + y
		ExpressaoLet letInterno = new ExpressaoLet("x", vi(5), 
				soma(ref("x"), ref("y")));  
	
		//let y = 10 in let x = 5 in x + y
		ExpressaoLet letExterno = new ExpressaoLet("y", vi(10), letInterno);
		
		
		assertEquals(vi(15), letExterno.avaliar());
	}
	//"let x = 10 in let x = 5 in x + x"
	@Test
	public void DONETesteExpressaoLet() {
		ExpressaoLet letInterno = new ExpressaoLet("x", vi(5), 
				soma(ref("x"), ref("x")));  
	
		ExpressaoLet letExterno = new ExpressaoLet("x", vi(10), letInterno);
		
		//Testa o valor do LetInterno:
		assertEquals(vi(10), letInterno.avaliar());
		//Testa o valor do LetExterno:
		assertEquals(vi(10), letExterno.avaliar());
		//Pode-se concluir que nesse caso, quando o valor de x é sobrescrito:
		// como por exemplo let x = 10 in let x = 5 in x + x;
		//O valor de x que é utilizado na soma x + x é o ultimo valor referencidado a x
		//Logo o resultado da soma é igual a 10.
	}
	
	public ExpressaoSoma soma(Expressao exp1, Expressao exp2) {
		return new ExpressaoSoma(exp1, exp2);
	}
	
	public ValorInteiro vi(Integer v) {
		return new ValorInteiro(v);
	}
	
	public ExpressaoRefId ref(String id) {
		return new ExpressaoRefId(id);
	}

}
