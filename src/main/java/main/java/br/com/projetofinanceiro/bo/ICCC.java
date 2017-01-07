package main.java.br.com.projetofinanceiro.bo;

public class ICCC extends Imposto{

	public ICCC() {
	}

	public ICCC(Imposto imposto) {
		super(imposto);
	}
	
	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000) {
			return orcamento.getValor() * 0.5;
		}else if ( orcamento.getValor() <= 3000 ) {
			return orcamento.getValor() * 0.7;
		}else {
			return (orcamento.getValor() * 0.8) + 30;
		}
	}

}
