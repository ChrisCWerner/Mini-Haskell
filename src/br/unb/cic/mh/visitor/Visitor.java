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

public interface Visitor {
	public void visitar(ExpressaoIfThenElse exp);
	public void visitar(ExpressaoLet exp);
	public void visitar(ExpressaoSoma exp);
	public void visitar(ExpressaoRefId exp);
	public void visitar(ExpressaoAplicacao exp);
	public void visitar(ValorInteiro exp);
	public void visitar(ValorBooleano exp);
	public void visitar(ValorLista exp);
	public void visitar(ExpressaoAnd exp);
	public void visitar(ExpressaoNot expressaoNot);
	public void visitar(ExpressaoIgualdade expressaoIgualdade);
}
