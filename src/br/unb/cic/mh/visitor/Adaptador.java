package br.unb.cic.mh.visitor;

import br.unb.cic.mh.ExpressaoAnd;
import br.unb.cic.mh.ExpressaoAplicacao;
import br.unb.cic.mh.ExpressaoIfThenElse;
import br.unb.cic.mh.ExpressaoIgualdade;
import br.unb.cic.mh.ExpressaoLet;
import br.unb.cic.mh.ExpressaoNot;
import br.unb.cic.mh.ExpressaoRefId;
import br.unb.cic.mh.ExpressaoSoma;
import br.unb.cic.mh.ValorBooleano;
import br.unb.cic.mh.ValorInteiro;
import br.unb.cic.mh.ValorLista;

public class Adaptador implements Visitor {

	@Override
	public void visitar(ExpressaoIfThenElse exp) {
	}

	@Override
	public void visitar(ExpressaoLet exp) {
	}

	@Override
	public void visitar(ExpressaoSoma exp) {
	}

	@Override
	public void visitar(ExpressaoRefId exp) {
	}

	@Override
	public void visitar(ExpressaoAplicacao exp) {
	}

	@Override
	public void visitar(ValorInteiro exp) {
	}

	@Override
	public void visitar(ValorBooleano exp) {
	}

	@Override
	public void visitar(ValorLista exp) {
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

}
