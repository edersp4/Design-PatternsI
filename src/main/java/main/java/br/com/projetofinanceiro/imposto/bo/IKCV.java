package main.java.br.com.projetofinanceiro.imposto.bo;

import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class IKCV extends TemplateDeImpostoCondicional{

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.05;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.07;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500;
	}

}
