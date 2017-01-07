package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.projetofinanceiro.bo.Item;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class IHIT extends TemplateDeImpostoCondicional{


	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * (0.01 * orcamento.getListaItens().size());
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.13 + 100;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento orcamento) {
		List<String>noOrcamento = new ArrayList<>();
		
		for (Item item : orcamento.getListaItens()) {
			if(noOrcamento.contains(item.getDescricao())) {
				return true;
			}else {
				noOrcamento.add(item.getDescricao());
			}
		}
		return false;
	}

}
