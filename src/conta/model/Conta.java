package conta.model;

import conta.util.Cores;

public class Conta {
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	
	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		if(this.getSaldo() < valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
		}else {
			this.setSaldo(this.getSaldo() - valor); 
			System.out.println("O novo saldo é: " + this.saldo);
 			return true;
		}
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Novo saldo : R$ " + this.saldo);
	}
	
	public void visualizar() {
		String tipoConta = "";
		
		switch (this.tipo) {
		case 1:
			tipoConta = "Conta Corrente";
			break;
		case 2:
			tipoConta = "Conta Poupança";
			break;
		default:
			System.out.println("Dado invalido!! Favor informar 1 - Conta corrente ou 2 - Conta poupança");
			break;
		}
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*= ");
		System.out.println(   Cores.TEXT_WHITE_BOLD+"       Dados da conta      " + Cores.TEXT_RESET);
		System.out.println("Titular: " + this.titular);
		System.out.println("Número da conta: " + this.numero);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Tipo de conta: " + tipoConta);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*= ");

	}
}
