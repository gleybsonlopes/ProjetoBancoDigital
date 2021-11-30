package Av2ContaCorrente;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int opcao;
		int opcao2;
		Conta conta1 = new Conta();
		ContaCorrente conta2 = new ContaCorrente();
		ContaPoupanca conta3 = new ContaPoupanca();

		do {

			System.out.println("********** Banco Digital *********");
			System.out.println("**********************************");
			System.out.println("******* 1 - Conta Padrão *********");
			System.out.println("******* 2 - Conta Corrente *******");
			System.out.println("******* 3 - Conta Poupança *******");
			System.out.println("*********** 0 - Sair *************");

			opcao = entrada.nextInt();

			if (opcao == 1) {

				do {
					System.out.println("******** Conta Padrão ********");
					System.out.println("* 1 - Cadastro de Conta ******");
					System.out.println("* 2 - Saldo ******************");
					System.out.println("* 3 - Realizar Saque *********");
					System.out.println("* 4 - Realizar Despósito *****");
					System.out.println("* 5 - Dados da Conta *********");

					System.out.println("* 0 - Sair *******************");
					opcao2 = entrada.nextInt();

					if (opcao2 == 1) {

						System.out.println("Digite o numero da conta padrão: ");
						conta1.setNumero(entrada.nextInt());
						System.out.println();
						System.out.println("Digite o nome do cliente da conta padrão: ");
						conta1.setNomeCliente(entrada.next());
						System.out.println();
						System.out.println("Digite o saldo da conta padrão: ");
						conta1.setSaldo(entrada.nextDouble());
						System.out.println();
						System.out.println("\nDados da conta padrão: \n");

						System.out.println(conta1);

					}
					if (opcao2 == 2) {

						System.out.println("O saldo atual da conta Padrão é R$: " + conta1.getSaldo());

					}
					if (opcao2 == 3) {

						System.out.println("Digite o valor do saque: ");
						conta1.saque(entrada.nextDouble());
						System.out.println("O saldo atual da conta Padrão é R$: " + conta1.getSaldo());

					}
					if (opcao2 == 4) {

						System.out.println("Digite o valor do Depósito: ");
						conta1.deposito(entrada.nextDouble());
						System.out.println("O saldo atual da conta Padrão é R$: " + conta1.getSaldo());

					}
					if (opcao2 == 5) {
						System.out.println(conta1);
					}
				} while (opcao2 != 0);
				System.out.println("Sessão encerrada!");

			}
			if (opcao == 2) {

				do {

					System.out.println("\n******* Conta Corrente *******");
					System.out.println("* 1 - Cadastro de Conta ******");
					System.out.println("* 2 - Saldo ******************");
					System.out.println("* 3 - Realizar Saque *********");
					System.out.println("* 4 - Realizar Despósito *****");
					System.out.println("* 5 - Fazer Empréstimo *******");
					System.out.println("* 6 - Dados da Conta *********");
					System.out.println("* 0 - Sair *******************");
					opcao2 = entrada.nextInt();

					if (opcao2 == 1) {
						System.out.println("Digite o numero da conta Corrente: ");
						conta2.setNumero(entrada.nextInt());
						System.out.println();
						System.out.println("Digite o nome do cliente da conta Corrente: ");
						conta2.setNomeCliente(entrada.next());
						System.out.println();
						System.out.println("Digite o saldo da conta Corrente: ");
						conta2.setSaldo(entrada.nextDouble());
						System.out.println("Digite o Limite de Empréstimo da conta Corrente: ");
						conta2.setLimiteEmprestimo(entrada.nextDouble());

						System.out.println();
						System.out.println("\nDados da conta Corrente: \n");

						System.out.println(conta2);

					}
					if (opcao2 == 2) {
						System.out.println("O saldo da conta corrente é R$: " + conta2.getSaldo());

					}
					if (opcao2 == 3) {
						System.out.println("Digite o valor que deseja sacar da Conta Corrente: ");
						conta2.saque(entrada.nextDouble());
						System.out.println("O saldo atual da conta corrente é R$: " + conta2.getSaldo());

					}
					if (opcao2 == 4) {
						System.out.println("Digite o valor que deseja Depositar: ");
						conta2.deposito(entrada.nextDouble());
						System.out.println("O saldo atual da conta corrente é R$: " + conta2.getSaldo());

					}
					if (opcao2 == 5) {
						System.out.println("Digite o valor que deseja Fazer o Empréstimo: ");
						conta2.emprestimo(entrada.nextDouble());
						System.out.println("O saldo atual da conta corrente é R$: " + conta2.getSaldo());

					}
					if (opcao2 == 6) {
						System.out.println(conta2);
					}

				} while (opcao2 != 0);
				System.out.println("Sessão encerrada!");

			}
			if (opcao == 3) {
				do {

					System.out.println("******* Conta Poupança *******");
					System.out.println("* 1 - Cadastro de Conta ******");
					System.out.println("* 2 - Saldo ******************");
					System.out.println("* 3 - Realizar Saque *********");
					System.out.println("* 4 - Realizar Despósito *****");
					System.out.println("* 5 - Taxa de Juros **********");
					System.out.println("* 6 - Dados da Conta *********");
					System.out.println("* 7 - Render Juros ***********");
					System.out.println("* 0 - Sair *******************");
					opcao2 = entrada.nextInt();

					if (opcao2 == 1) {

						System.out.println("Digite o numero da conta Poupança");
						conta3.setNumero(entrada.nextInt());

						System.out.println("Digite o nome do cliente da conta Poupança: ");
						conta3.setNomeCliente(entrada.next());

						System.out.println("Digite a Taxa de Juros desejada: ");
						conta3.setTaxaJuros(entrada.nextDouble());

						System.out.println("Digite o Saldo da conta Poupança: ");
						conta3.setSaldo(entrada.nextDouble());

						System.out.println();
						System.out.println("\nDados da conta Poupança: \n");

						System.out.println(conta3);

					}
					if (opcao2 == 2) {
						System.out.println("O saldo da sua conta Poupança é R$: " + conta3.getSaldo());

					}
					if (opcao2 == 3) {
						System.out.println("Digite o valor que deseja sacar: ");

						conta3.saque(entrada.nextDouble());

						System.out.println("O saldo atual da sua conta Poupança é R$: " + conta3.getSaldo());

					}
					if (opcao2 == 4) {
						System.out.println("Digite o valor de que deseja depositar: ");
						conta3.deposito(entrada.nextDouble());

						System.out.println("O saldo atual da sua conta Poupança é R$: " + conta3.getSaldo());

					}
					if (opcao2 == 5) {
						System.out.println("A sua taxa de juros ao ano é " + conta3.getTaxaJuros() + "% ao ano.");

					}
					if (opcao2 == 6) {
						System.out.println(conta3);
					}
					if (opcao2 == 7) {
						conta3.renderJuros();
						System.out.println("Seu dinheiro está rendendo, seu saldo agora é R$:" + conta3.getSaldo());

					}
				} while (opcao2 != 0);
				System.out.println("Sessão encerrada!");

			}

		} while (opcao != 0);
		System.out.println("Sessão encerrada!");

		entrada.close();

	}

}
