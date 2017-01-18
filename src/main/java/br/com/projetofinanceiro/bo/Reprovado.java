package br.com.projetofinanceiro.bo;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Or�amento est� em estado de reprova��o, n�o pode aprovar agora");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("J� estou em estado de Reprova��o");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
