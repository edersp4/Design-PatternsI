package main.java.br.com.projetofinanceiro.investimento.bo;

import main.java.br.com.projetofinanceiro.enun.Formato;
import main.java.br.com.projetofinanceiro.enun.Requisicao;
import main.java.br.com.projetofinanceiro.interfaces.Resposta;

public class RespostaEmPorcento implements Resposta {

	private Resposta proximo;
	
	
	public RespostaEmPorcento(Resposta proximo) {
		this.proximo = proximo;
		
	}

	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + "%" + conta.getSaldo());
		} else {
			proximo.responde(requisicao, conta);
		}

	}


}
