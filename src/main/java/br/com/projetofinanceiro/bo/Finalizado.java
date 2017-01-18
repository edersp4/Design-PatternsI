package br.com.projetofinanceiro.bo;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais j� estou finalizado!");
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais j� estou finalizado!");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais j� estou finalizado!");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("N�o posso mudar mais j� estou finalizado!");
	}

}
