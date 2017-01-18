package br.com.projetofinanceiro.bo;

public class Orcamento {
	protected double valor;
	protected EstadoDeUmOrcamento estadoAtual;

	
	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}
}
