package main.java.br.com.projetofinanceiro.imposto.bo;

import java.util.Calendar;
import java.util.List;

import main.java.br.com.projetofinanceiro.investimento.bo.Conta;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void corpo(List<Conta> contas) {
		 for(Conta conta : contas) {
	          System.out.println( conta.getTitular() + " - " + conta.getNumero() + " - " + conta.getAgencia() + " - " + conta.getSaldo() );
	        }
	}

	@Override
	protected void rodape() {
		System.out.println("banco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

}
