package exercicio2;
import java.util.Scanner;

public class negativo_positivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero = sc.nextInt();
		
		if (numero < 0) {
			System.out.println("O número é negativo");
		}
		
		else {
			System.out.println("O número é positivo");
		}	
			
		sc.close();
		
		}	
	}
	
		
	

		
