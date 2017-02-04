package br.alura.aula6.padrao.builder;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.List;

import org.junit.Test;

public class NotaFiscalTest {

	@Test
	public void test() {
		
		CriadorDeNotaFiscal criador = new CriadorDeNotaFiscal(); 
		
		criador.paraEmpresa("Caelum Ensino e Inovaçãoo");
		List<ItemDaNota>itens = null;
		double valorTotal = 0;
		
		for (ItemDaNota itemDaNota : itens) {
			valorTotal += itemDaNota.getValor();
		}
		
		double impostos = valorTotal * 0.05;
		
		NotaFiscal notaFiscal = new NotaFiscal("razao social qualquer", "um cnpj", Calendar.getInstance() , valorTotal, impostos, itens, "observa��es quaisquer aqui");
	}

}
