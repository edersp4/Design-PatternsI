package main.java.br.com.projetofinanceiro.investimento.bo;

import java.util.Random;

import main.java.br.com.projetofinanceiro.investimento.interfaces.Investimento;

public class Arrojado implements Investimento {

	private Random random;

	public Arrojado() {
		this.random = new Random();
	}
	
	@Override
	public double calcular(Conta conta) {
		int chute = random.nextInt(10);
		
		if (chute >= 0 && chute <=1) {
			return conta.getSaldo() * 0.5;
		}else if (chute >= 2 && chute <= 4 ) {
			return conta.getSaldo() * 0.3;
		}else {
			return conta.getSaldo() * 0.006;
		}
	}

}
