package main.java.br.com.projetofinanceiro.descontos;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class CalculadorDeDesconto {
	public double calcular(Orcamento orcamento) {
		// verifica primeira regra de possível desconto
		Desconto desconto1 = new DescontoPorMaisDeCincoItens(); 
		Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
		
		desconto1.setProximo(desconto2);
		
		return desconto1.descontar(orcamento);
	}
}
