import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá mundo!");
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);
//		locale = biblioteca para o .
		System.out.printf("%.4f\n", x);
//		%.4f = 4 casas decimais
		System.out.println("Resultado = " + x + " Metros");
		System.out.printf("Resultado = %.2f metros%n", x);
		
		
//		%f = ponto flutuante (casa decimal)
//		%d = inteiro
//		%s = texto
//		%n = quebra de linha
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}
}
