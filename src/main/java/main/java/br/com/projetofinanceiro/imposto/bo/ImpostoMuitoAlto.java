package main.java.br.com.projetofinanceiro.imposto.bo;

import main.java.br.com.projetofinanceiro.bo.Imposto;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class ImpostoMuitoAlto extends Imposto{

	public ImpostoMuitoAlto() {
	}
	
	public ImpostoMuitoAlto(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.2 + calculoDoOutroImposto(orcamento);
	}

}
