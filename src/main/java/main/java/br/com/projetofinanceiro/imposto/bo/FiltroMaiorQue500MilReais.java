package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.ArrayList;
import java.util.List;

import main.java.br.com.projetofinanceiro.filtro.bo.Filtro;
import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class FiltroMaiorQue500MilReais extends Filtro{

	public FiltroMaiorQue500MilReais() {
	}
	public FiltroMaiorQue500MilReais(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<>();
		
		for (Conta conta : filtrada) {
			if (conta.getSaldo() > 500_000) {
				filtrada.add(conta);
			}
			
		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
