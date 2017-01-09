package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.List;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class RelatorioSimples extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco do Brasil");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta conta : contas) {
			System.out.println("Titular da Conta:" + conta.getTitular() +  "    saldo: " + conta.getSaldo()  );
		}
	}

	@Override
	protected void rodape() {
		System.out.println("telefone: 4451-5811");
	}

}
