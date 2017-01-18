package br.com.projetofinanceiro.bo;

public class EmAprovacao implements EstadoDeUmOrcamento {

	private boolean descontoAplicado = false;
	
	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}else {
			throw new RuntimeException("Desconto já Aplicado");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Um orçamento em aprovação não pode ir direto para finalizado diretamentes");
	}

}
