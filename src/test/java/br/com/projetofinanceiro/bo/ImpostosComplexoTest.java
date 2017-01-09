package br.com.projetofinanceiro.bo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

import br.com.projetofinanceiro.databuilder.CriadorDeOrcamento;
import main.java.br.com.projetofinanceiro.bo.ISS;
import main.java.br.com.projetofinanceiro.bo.Imposto;
import main.java.br.com.projetofinanceiro.bo.Orcamento;
import main.java.br.com.projetofinanceiro.imposto.bo.ICCP;

public class ImpostosComplexoTest {

	@Test
	public void test() {
		Imposto iss = new ISS(new ICCP());
		
		Orcamento orcamento = new CriadorDeOrcamento().comValorDe(500).constroi();
		
		double valor = iss.calcula(orcamento);
		assertThat(330.0, equalTo(valor));
		
	}

}
