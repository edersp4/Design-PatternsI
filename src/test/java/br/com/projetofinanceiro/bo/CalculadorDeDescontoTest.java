package br.com.projetofinanceiro.bo;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import br.com.projetofinanceiro.databuilder.CriadorDeOrcamento;
import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.CalculadorDeDesconto;

public class CalculadorDeDescontoTest {

	private CalculadorDeDesconto calculadorDeDesconto;


	@Before
	public void iniciar() {
		calculadorDeDesconto = new CalculadorDeDesconto();
	}
	
	@Test
	public void testeVendaMaiorQue500() {
		Orcamento orcamento = new CriadorDeOrcamento().comValorDe(600).adicionaItem("Caneta" , 300.0)
				.adicionaItem("Lapis" , 300.0)
				.constroi();
		
		double desconto = calculadorDeDesconto.calcular(orcamento);
		assertThat(desconto, is(42.00000000000001 ));
	}

	@Test
	public void testeVendaMenorQue500() {
		Orcamento orcamento = new CriadorDeOrcamento().comValorDe(500).adicionaItem("Caneta" , 250.0)
				.adicionaItem("Lapis" , 250.0)
				.constroi();
		
		double desconto = calculadorDeDesconto.calcular(orcamento);
		assertThat(desconto, equalTo(0.0));
	}
	
	@Test
	public void comVendaCasada() {
		Orcamento orcamento = new CriadorDeOrcamento().comValorDe(500).adicionaItem("LAPIS", 15.00).adicionaItem("CANETA", 15.00)
				.adicionaItem("BOLACHA", 15.00).constroi();
		
		double desconto = calculadorDeDesconto.calcular(orcamento);
		assertThat(desconto, equalTo(25.00));
		
	}
	
}
