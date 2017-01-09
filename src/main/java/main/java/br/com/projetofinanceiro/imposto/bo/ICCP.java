package main.java.br.com.projetofinanceiro.imposto.bo;

import br.com.projetofinanceiro.bo.Item;
import main.java.br.com.projetofinanceiro.bo.Imposto;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class ICCP extends TemplateDeImpostoCondicional {

	public ICCP() {
		super();
		
	}

	public ICCP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.6 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10 + calculoDoOutroImposto(orcamento);
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() > 500 && temItemMaiorQue100ReaisNo(orcamento);
	}

	private boolean temItemMaiorQue100ReaisNo(Orcamento orcamento) {
		for (Item item : orcamento.getListaItens()) {
			if (item.getValor() > 100.0) {
				return true;
			}
		}
		return false;
	}

}
