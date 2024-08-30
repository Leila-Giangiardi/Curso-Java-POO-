package app;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import model.Contribuinte;
import model.PessoaFisica;
import model.PessoaJuridica;


public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Contribuinte> list = new ArrayList<Contribuinte>();
		
		System.out.print("Digite o número de contribuintes: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Contribuinte #" + i + ":");
			System.out.print("Pessoa física ou jurídica f/j)? ");
			char type = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (type == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
//		
			else {
				System.out.print("Número de Funcionários: ");
				int numFuncionarios = sc.nextInt();
				list.add(new PessoaJuridica(nome, rendaAnual, numFuncionarios));	
			}
		}

		double soma = 0.0;
		System.out.println();
		System.out.println("Impostos a pagar:");
		for (Contribuinte ct : list) {
			double imposto = ct.calcularImposto();
			System.out.println(ct.getNome() + ": $ " + String.format("%.2f", imposto));
			soma += imposto;
		}
		
		System.out.println();
		System.out.println("Total de imposto: $ " + String.format("%.2f", soma));
		
		sc.close();
	}
}