import java.util.InputMismatchException;
import java.util.Scanner;

public class StackTrace {
	public static void main(String[] args) {
		method1();
		System.out.println("FIM DO PROGRAMA");
	}

	public static void method1() {
		System.out.println("***METHOD1 iNICIADO***");
		method2();
		System.out.println("***METHOD1 FINALIZADO***");
	}

	public static void method2() {
		System.out.println("***METHOD2 INICIADO***");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace(); //imprime o rastreamento do stack
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Input error");
		}
		sc.close();
		System.out.println("***METHOD2 FINALIZADO***");
	}
}
