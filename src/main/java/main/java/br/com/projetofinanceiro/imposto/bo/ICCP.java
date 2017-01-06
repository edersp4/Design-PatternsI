package main.java.br.com.projetofinanceiro.imposto.bo;

import br.com.projetofinanceiro.bo.Item;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class ICCP extends TemplateDeImpostoCondicional {

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.6;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.10;
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
