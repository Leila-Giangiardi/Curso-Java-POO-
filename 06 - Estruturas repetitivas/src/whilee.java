
import java.util.Scanner;

public class whilee {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int soma = 0; //tem q começar com algum valor
		while (x != 0) {
			soma += x; //ou soma = soma + x
			x = sc.nextInt();
		}
		System.out.println(soma);
		sc.close();
	}

}
