
import java.util.Scanner;

public class forr {
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();		
		int soma = 0;
		
		for (int i=0; i<N; i++) { // i = i+1
			int x = sc.nextInt();
			soma = soma + x;
			
		}
		System.out.println(soma);
		
		sc.close();
		
	}

}




//contagem 
//for (int i=0; i<5; i++) {
//System.out.println("Valor de i: " + i);
//}

//contagem regressiva
//for (int i=4; i>=0; i--) {
//System.out.println("Valor de i: " + i);
//}