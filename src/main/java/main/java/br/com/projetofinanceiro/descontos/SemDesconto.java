package main.java.br.com.projetofinanceiro.descontos;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.interfaces.Desconto;

public class SemDesconto implements Desconto {

	@Override
	public double descontar(Orcamento orcamento) {
		return 0;
	}

	@Override
	public void setProximo(Desconto desconto) {
		//não tem
	}

}
