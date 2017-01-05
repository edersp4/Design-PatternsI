package main.java.br.com.projetofinanceiro.interfaces;

import main.java.br.com.projetofinanceiro.enun.Requisicao;
import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public interface Resposta {
	void responde(Requisicao requisicao , Conta conta);
}
