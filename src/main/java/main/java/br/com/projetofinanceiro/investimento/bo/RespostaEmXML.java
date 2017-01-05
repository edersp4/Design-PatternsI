package main.java.br.com.projetofinanceiro.investimento.bo;

import main.java.br.com.projetofinanceiro.enun.Formato;
import main.java.br.com.projetofinanceiro.enun.Requisicao;
import main.java.br.com.projetofinanceiro.interfaces.Resposta;

public class RespostaEmXML implements Resposta {
	private Resposta outraResposta;
	
	public RespostaEmXML(Resposta outraResposta) {
		this.outraResposta = outraResposta;
	}
	@Override
	public void responde(Requisicao requisicao, Conta conta) {
		if (requisicao.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo() + "</saldo></conta>");
		}else {
			outraResposta.responde(requisicao, conta);
		}
	}
}
