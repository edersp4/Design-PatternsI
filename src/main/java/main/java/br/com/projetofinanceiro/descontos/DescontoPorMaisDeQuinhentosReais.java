package main.java.br.com.projetofinanceiro.descontos;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{

	private Desconto proximo;

	@Override
	public double descontar(Orcamento orcamento) {
		  // verifica segunda regra de possível desconto
        if(orcamento.getValor() > 500.0) {
          return orcamento.getValor() * 0.07;
        }else {
        	return proximo.descontar(orcamento);
        }
	}

	@Override
	public void setProximo(Desconto desconto) {
		this.proximo = desconto;
		
	}
}
