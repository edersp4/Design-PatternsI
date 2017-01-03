package main.java.br.com.projetofinanceiro.descontos.interfaces;

import main.java.br.com.projetofinanceiro.bo.Orcamento;

public interface Desconto {
	double descontar(Orcamento orcamento);
	
	void setProximo(Desconto desconto);
}
