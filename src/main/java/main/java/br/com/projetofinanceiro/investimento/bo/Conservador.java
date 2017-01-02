package main.java.br.com.projetofinanceiro.investimento.bo;

import main.java.br.com.projetofinanceiro.investimento.interfaces.Investimento;

public class Conservador implements Investimento {

	@Override
	public double calcular(Conta conta) {
		return conta.getSaldo() * 0.008;
	}
	
	

}
