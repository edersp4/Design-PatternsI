package main.java.br.com.projetofinanceiro.investimento.bo;

import main.java.br.com.projetofinanceiro.investimento.interfaces.Investimento;

public class RealizadorDeInvestimentos {
	public void realiza(Conta conta , Investimento investimento) {
		double resultado = investimento.calcular(conta);
		conta.deposita(resultado * 0.75);
		System.out.println("Novo saldo " + conta.getSaldo() );
	}
}
