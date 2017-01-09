package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.ArrayList;
import java.util.List;

import main.java.br.com.projetofinanceiro.filtro.bo.Filtro;
import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class FiltroMenorQue100Reais extends Filtro {

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtradas = new ArrayList<>();

		for (Conta conta : contas) {
			if (conta.getSaldo() < 100) {
				filtradas.add(conta);
			}
		}

		filtradas.addAll(proximo(contas));
		return filtradas;
	}

}
