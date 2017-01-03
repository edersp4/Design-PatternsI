package br.com.projetofinanceiro.bo;

import static org.junit.Assert.*;

import org.junit.Before;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.descontos.CalculadorDeDesconto;

public class CalculadorDeDescontoTest {

	private CalculadorDeDesconto calculadorDeDesconto;


	@Before
	public void iniciar() {
		calculadorDeDesconto = new CalculadorDeDesconto();
	}
	
	
	@Test
	public void testCalcular() {
		Orcamento orcamento = new Orcamento(500.0);
		orcamento.adicionaItem(new Item("Caneta" , 250.0));
		orcamento.adicionaItem(new Item("Lapis" , 250.0));
	}

}
