package main.java.br.com.projetofinanceiro.investimento.bo;

public class Conta {
	private double saldo;
	private String titular;
	
	
	public Conta(double saldo, String titular) {
		super();
		this.saldo = saldo;
		this.titular = titular;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
}
