package Av2ContaCorrente;

public class ContaCorrente extends Conta {

	private double limiteEmprestimo;

	public void saque(double valor) {
		super.saque(valor);
		super.saque(20);
		

	}

	public boolean emprestimo(double valor) {
		boolean res = false;

		if (valor < this.limiteEmprestimo) {
			/// fazer emprestimo
			super.deposito(valor);
			super.saque(10);
			System.out.println("Empréstimo realizado com sucesso!");

		} else {
			/// não fazer emprestimo
			System.out.println("Não foi possível realizar o emprestimo, limite excedido!\n");
		}

		return res;

	}
	public ContaCorrente() {
		
	}

	public ContaCorrente(int numero, String nomeCliente, double saldo, double limiteEmprestimo) {
		super(numero, nomeCliente, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	@Override
	public String toString() {
		return "Nome Cliente: " + this.getNomeCliente() + " \nNúmero da Conta Corrente: " + this.getNumero()
				+ " \nSaldo: R$: " + this.getSaldo() + "\nLimite Empréstimo R$: " + this.getLimiteEmprestimo() + "\n ";
	}
}
