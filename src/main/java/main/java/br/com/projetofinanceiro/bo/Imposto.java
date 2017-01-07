package main.java.br.com.projetofinanceiro.bo;

public abstract class Imposto {
	protected Imposto outroImposto;
	
	public abstract double calcula(Orcamento orcamento);
	
	public Imposto() {
	}

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}
	
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if (outroImposto == null) {
			return 0;
		}
		return outroImposto.calcula(orcamento);
	}
	
	
}
