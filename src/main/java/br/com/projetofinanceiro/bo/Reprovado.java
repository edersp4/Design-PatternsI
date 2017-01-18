package br.com.projetofinanceiro.bo;

public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("Orçamento está em estado de reprovação, não pode aprovar agora");
	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("Já estou em estado de Reprovação");
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
