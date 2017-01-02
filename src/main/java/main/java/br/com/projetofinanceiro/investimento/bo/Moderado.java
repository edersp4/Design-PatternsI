package main.java.br.com.projetofinanceiro.investimento.bo;

import java.util.Random;

import main.java.br.com.projetofinanceiro.investimento.interfaces.Investimento;

public class Moderado implements Investimento {

	private Random random;
	
	public Moderado() {
		this.random = new Random();
	}
	
	@Override
	public double calcular(Conta conta) {
		if (random.nextInt(2) == 0 ) {
			return conta.getSaldo() * 0.025;
		}else {
			return conta.getSaldo() * 0.007;
		}
	}

}
