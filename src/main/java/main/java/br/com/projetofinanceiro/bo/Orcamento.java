package main.java.br.com.projetofinanceiro.bo;

import java.util.ArrayList;
import java.util.List;

import br.com.projetofinanceiro.bo.Item;

public class Orcamento {
	private double valor;
	private List<Item> listaItens;

	public Orcamento(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void adicionaItem(Item item) {
		listaItens.add(item);
	}

	public List<Item> getListaItens() {
		return listaItens;
	}

}
