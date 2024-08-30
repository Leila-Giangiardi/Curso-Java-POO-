package application;

import java.util.Locale;
import java.util.Scanner;

import entitites.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o número da conta: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Digite o titular da conta: ");
		String nome = sc.nextLine();
		
		System.out.print("vai fazer deposito inicial (s/n)?  ");
		char resposta = sc.next().charAt(0);
		
		Conta conta;
		
		if (resposta == 's') {
			System.out.print("Digite o valor do deposito inicial: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, nome, depositoInicial);
		}
		
		else {
			conta = new Conta(numero, nome);
		}
		
		System.out.println();
		System.out.print("Dados da conta: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do deposito: ");
		double valorDeposito = sc.nextDouble();
		conta.deposito(valorDeposito);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Digite o valor do saque: ");
		double valorSaque = sc.nextDouble();
		conta.saque(valorSaque);
		System.out.println("Dados da conta atualizados: ");
		System.out.println(conta);
		
		sc.close();
	}
}
