package br.unb.cic.mh.visitor;

import br.unb.cic.mh.ExpressaoAnd;
import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoDiferenca;
import br.unb.cic.mh.ExpressaoDivide;
import br.unb.cic.mh.ExpressaoFatorial;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgualdade;
import br.unb.cic.mh.ExpressaoLet;
import br.unb.cic.mh.ExpressaoMaiorOuIgual;
import br.unb.cic.mh.ExpressaoMaiorQue;
import br.unb.cic.mh.ExpressaoMenorOuIgual;
import br.unb.cic.mh.ExpressaoMenorQue;
import br.unb.cic.mh.ExpressaoMultiplica;
import br.unb.cic.mh.ExpressaoNot;
import br.unb.cic.mh.ExpressaoOr;
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ExpressaoSubtrai;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;
import br.unb.cic.mh.ValorLista;

public class PPVisitor implements Visitor {

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
		
	}

	@Override
	public void visitar(ExpressaoLet exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
		System.out.print("(");
		exp.getSub1().aceitar(this);
		System.out.println(" + ");
		exp.getSub2().aceitar(this);
		System.out.println(")");
	}

	@Override
	public void visitar(ExpressaoRefId exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ValorInteiro exp) {
		System.out.println(exp.getValor());
	}

	@Override
	public void visitar(ValorBooleano exp) {
		if(exp.getValor()) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}

	@Override
	public void visitar(ValorLista exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoAnd exp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoNot expressaoNot) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoIgualdade expressaoIgualdade) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoSubtrai expressaoSubtrai) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMultiplica expressaoMultiplica) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoDivide expressaoDivide) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoOr expressaoOr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoDiferenca expressaoDiferenca) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaiorQue expressaoMaiorQue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMaiorOuIgual expressaoMaiorOuIgual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMenorQue expressaoMenorQue) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoMenorOuIgual expressaoMenorOuIgual) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitar(ExpressaoFatorial expressaoFatorial) {
		// TODO Auto-generated method stub
		
	}

}
