package main.java.br.com.projetofinanceiro.bo;

public class CalculadoraDeImpostos {
	
	public double realizaCalculos(Orcamento orcamento ,Imposto imposto) {
		return imposto.calcula(orcamento);
	}
}
