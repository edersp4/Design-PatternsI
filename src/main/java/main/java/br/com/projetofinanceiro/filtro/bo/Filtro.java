package main.java.br.com.projetofinanceiro.filtro.bo;

import java.util.ArrayList;
import java.util.List;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public abstract class Filtro {
	protected Filtro outroFiltro;
	
	public Filtro() {
	}

	public Filtro(Filtro outroFiltro) {
		this.outroFiltro = outroFiltro;
		
	}
	
	public abstract List<Conta> filtra(List<Conta>contas);
	
	protected List<Conta> proximo(List<Conta>contas) {
		if(outroFiltro != null) {
			return outroFiltro.filtra(contas);
		}else {
			return new ArrayList<Conta>();
		}
	}
	
}
