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
	public void visitar(ExpressaoSubtrai expressaoSubtrai);
	public void visitar(ExpressaoMultiplica expressaoMultiplica);
	public void visitar(ExpressaoDivide expressaoDivide);
	public void visitar(ExpressaoOr expressaoOr);
	public void visitar(ExpressaoDiferenca expressaoDiferenca);
	public void visitar(ExpressaoMaiorQue expressaoMaiorQue);
	public void visitar(ExpressaoMaiorOuIgual expressaoMaiorOuIgual);
	public void visitar(ExpressaoMenorQue expressaoMenorQue);
	public void visitar(ExpressaoMenorOuIgual expressaoMenorOuIgual);
	public void visitar(ExpressaoFatorial expressaoFatorial);
}
