package Av2ContaCorrente;

public class Conta {
	private int numero;
	private String nomeCliente;
	private double saldo;

	public Conta(int numero, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		
		
	}

	public void deposito(double valor) {
		this.saldo += valor;
		

	}

	public void saque(double valor) {
		this.saldo -= valor;
		
	}

	public Conta() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Nome Cliente: " + this.getNomeCliente() + " \nNúmero da Conta: " + this.getNumero() + " \nSaldo: R$: "
				+ this.getSaldo();
	}
	
	
}
