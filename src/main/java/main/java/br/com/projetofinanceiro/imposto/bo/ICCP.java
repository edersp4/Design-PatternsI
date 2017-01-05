package main.java.br.com.projetofinanceiro.imposto.bo;

import main.java.br.com.projetofinanceiro.bo.Imposto;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class ICCP extends TemplateDeImpostoCondicional {

	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return 0;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return 0;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return false;
	}

}
