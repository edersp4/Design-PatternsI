package br.com.projetofinanceiro.bo;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class Negativo implements EstadoDaConta {

	@Override
	public void saca(Conta conta, double valor) {
		throw new RuntimeException("Sua Conta está no vermeho não é possível sacar");
	}

	@Override
	public void deposita(Conta conta, double valor) {
		conta.setSaldo(conta.getSaldo() + (valor * 0.95));
		
		if (conta.getSaldo() > 0) {
			conta.estado = new Positivo();
		}
	}

}
