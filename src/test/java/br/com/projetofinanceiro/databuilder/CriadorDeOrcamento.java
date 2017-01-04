package br.com.projetofinanceiro.databuilder;

import br.com.projetofinanceiro.bo.Item;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class CriadorDeOrcamento {
	private Orcamento orcamento ;
	
	public CriadorDeOrcamento comValorDe(int valor) {
		orcamento = new Orcamento(valor);
		return this;
	}
	
	public  CriadorDeOrcamento adicionaItem(String nome , double valor) {
		orcamento.adicionaItem(new Item(nome, valor));
		return this;
	}

	public Orcamento constroi() {
		return orcamento;
	}

}
