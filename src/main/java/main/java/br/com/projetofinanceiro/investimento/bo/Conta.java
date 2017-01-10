package main.java.br.com.projetofinanceiro.investimento.bo;

import java.util.Calendar;

public class Conta {
	private double saldo;
	private String titular;
	private String numero;
	private String agencia;
	private Calendar dataAbertura;
	
	
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

	public String getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public Calendar getDataAbertura() {
		return this.dataAbertura;
	}
}
