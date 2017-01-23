package br.com.projetofinanceiro.bo;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public interface EstadoDaConta {
	void saca(Conta conta , double valor);
	
	void deposita(Conta conta , double valor);
}
