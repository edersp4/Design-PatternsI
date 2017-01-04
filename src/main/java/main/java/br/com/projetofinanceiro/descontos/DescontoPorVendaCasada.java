package main.java.br.com.projetofinanceiro.descontos;

import br.com.projetofinanceiro.bo.Item;
import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class DescontoPorVendaCasada implements Desconto {
	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {
		if (aconteceuVendaCasadaEm(orcamento))
			return orcamento.getValor() * 0.05;

		return 0;
	}

	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return existe("CANETA", orcamento) && existe("LAPIS", orcamento);
	}

	private boolean existe(String nomeDoItem, Orcamento orcamento) {
		for (Item item : orcamento.getListaItens()) {
			if (item.getDescricao().equals(nomeDoItem)) {
				return true;
			}
			
		}
		return false;
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
