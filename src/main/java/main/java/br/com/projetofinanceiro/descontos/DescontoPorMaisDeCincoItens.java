package main.java.br.com.projetofinanceiro.descontos;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class DescontoPorMaisDeCincoItens implements Desconto{
	private Desconto proximo;
	
	@Override
	public double descontar(Orcamento orcamento) {
		if (orcamento.getListaItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}else {
			return proximo.descontar(orcamento);
		}
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
	}

}
