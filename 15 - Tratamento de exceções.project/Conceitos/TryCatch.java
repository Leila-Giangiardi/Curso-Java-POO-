
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try { //try = tentar fazer algo
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			//especificação da execeção a ser tratada
			System.out.println("Posição inválida!");
			//implentação da lógica se entrar no cath
			
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		System.out.println("Fim do programa");
		sc.close();
	}
}