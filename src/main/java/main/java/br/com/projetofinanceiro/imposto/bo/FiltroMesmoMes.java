package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import main.java.br.com.projetofinanceiro.filtro.bo.Filtro;
import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class FiltroMesmoMes extends Filtro {

	public FiltroMesmoMes() {
	}

	public FiltroMesmoMes(Filtro filtro) {
		super(filtro);
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();

		for (Conta conta : filtrada) {
			if (conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				filtrada.add(conta);
			}
		}

		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
