package br.com.projetofinanceiro.bo;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import main.java.br.com.projetofinanceiro.bo.CalculadoraDeImpostos;
import main.java.br.com.projetofinanceiro.bo.ICCC;
import main.java.br.com.projetofinanceiro.bo.ICMS;
import main.java.br.com.projetofinanceiro.bo.ISS;
import main.java.br.com.projetofinanceiro.bo.Orcamento;

public class CalculadoraDeImpostosTest {

	
	@Test
	public void verificarICMScom10porCento() {
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		double resultado = calculadoraDeImpostos.realizaCalculos(new Orcamento(500) , new ICMS());
		assertThat(resultado, equalTo(50.0));
		
	}

	@Test
	public void verificarISScom6porCento() {
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		double resultado = calculadoraDeImpostos.realizaCalculos(new Orcamento(500) , new ISS());
		assertThat(resultado, equalTo(30.0));
		
	}
	
	@Test
	public void verificarICCC() {
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		double resultado = calculadoraDeImpostos.realizaCalculos(new Orcamento(500) , new ICCC());
		assertThat(resultado, equalTo(250.0));
		
	}
	
}
