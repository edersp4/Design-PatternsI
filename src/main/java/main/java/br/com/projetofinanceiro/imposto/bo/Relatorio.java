package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.List;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public abstract class Relatorio {
	protected abstract void cabecalho();
	protected abstract void corpo(List<Conta> contas);
	protected abstract void rodape();
	
	
	public void imprime(List<Conta>contas) {
		cabecalho();
		corpo(contas);
		rodape();
	}

}
