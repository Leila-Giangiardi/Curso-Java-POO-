import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Finally {
			public static void main(String[] args) {
		
		File file = new File("C:\\temp\\in.txt"); //exemplo de um diretório
		Scanner sc = null;
		try {
			//se a arquivo existir
			sc = new Scanner(file);
			while (sc.hasNextLine()) { //has -> percorre o arquivo
				System.out.println(sc.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Erro ao abrir arquivo: " + e.getMessage());
		} 
		finally { //independente de dar certo ou não, vai fechar o scanner
			if (sc != null) {
				sc.close();
			}
		}
	}	
}


