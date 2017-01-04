package main.java.br.com.projetofinanceiro.descontos;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class CalculadorDeDesconto {
	public double calcular(Orcamento orcamento) {
		// verifica primeira regra de possível desconto
		Desconto desconto1 = new DescontoPorMaisDeCincoItens(); 
		Desconto desconto2 = new DescontoPorMaisDeQuinhentosReais();
		Desconto desconto4 = new DescontoPorVendaCasada();
		Desconto desconto3 = new SemDesconto();
		
		desconto1.setProximo(desconto2);
		desconto2.setProximo(desconto4);
		desconto4.setProximo(desconto3);
		return desconto1.descontar(orcamento);
	}
}
