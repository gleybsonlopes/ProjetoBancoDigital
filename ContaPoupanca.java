package Av2ContaCorrente;

public class ContaPoupanca extends Conta {

	private double taxaJuros;
	private double correcaoJuros;

	double saldo = super.getSaldo();

	public void saque(double valor) {
		if (super.getSaldo() >= valor) {
			super.saque(valor);
		} else {
			System.out.println("Saque não realizado, seu saldo não" + " pode ficar negativo!");
		}

	}

	public void renderJuros(double valor) {

		correcaoJuros = super.getSaldo() * taxaJuros;

		/// render juros
		super.deposito(correcaoJuros);

		System.out.println();
	}

	public double renderJuros() {

		correcaoJuros = super.getSaldo() * taxaJuros / 100;

		super.deposito(correcaoJuros);

		return correcaoJuros;
	}

	public ContaPoupanca() {

	}

	public double getTaxaJuros() {

		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public ContaPoupanca(int numero, String nomeCliente, double TaxaJuros, double saldo) {
		super(numero, nomeCliente, saldo);

	}

	@Override
	public String toString() {
		return "Nome Cliente: " + this.getNomeCliente() + " \nNúmero da Conta Poupança :" + this.getNumero()
				+ " \nSaldo: R$: " + super.getSaldo() + "\nTaxa Juros " + this.getTaxaJuros() + "% ao ano. \n";
	}

}
