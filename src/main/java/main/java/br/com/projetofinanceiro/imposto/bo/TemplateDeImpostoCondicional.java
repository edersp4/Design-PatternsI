package main.java.br.com.projetofinanceiro.imposto.bo;

import main.java.br.com.projetofinanceiro.bo.Imposto;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public abstract class TemplateDeImpostoCondicional extends Imposto {

	
	public TemplateDeImpostoCondicional() {
		super();
	}
	
	public TemplateDeImpostoCondicional(Imposto outroImposto) {
		super(outroImposto);
	}
	

	@Override
	public double calcula(Orcamento orcamento) {
		if (deveUsarMaximaTaxacao(orcamento)) {
			return maximaTaxacao(orcamento);
		}else {
			return minimaTaxacao(orcamento);
		}
	}

	public abstract double minimaTaxacao(Orcamento orcamento);
	public abstract double maximaTaxacao(Orcamento orcamento);
	public abstract boolean deveUsarMaximaTaxacao(Orcamento orcamento);

}
