package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Funcionario;

public class ProgramS {
		public static void main(String[] args) {

			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);

			List<Funcionario> list = new ArrayList<>();
			
			// PART 1 - READING DATA:
			
			System.out.print("Quantos funcionários serão cadastrados? ");
			int n = sc.nextInt();
			
			for (int i=1; i<=n; i++) {
				System.out.println();
				System.out.println("Funcionário #" + i + ": ");

				System.out.print("Id: ");
				int id = sc.nextInt();
				while (hasId(list, id)) {
					System.out.print("Id já existente. : ");
					id = sc.nextInt();
				}
				
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Salary: ");
				double salary = sc.nextDouble();
				list.add(new Funcionario(id, name, salary));
			}

			// PART 2 - UPDATING SALARY OF GIVEN EMPLOYEE:
			
			System.out.println();
			System.out.print("Enter the employee id that will have salary increase: ");
			int id = sc.nextInt();
			Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			if (emp == null) {
				System.out.println("This id does not exist!");
			}
			else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);
			}
			
			// PART 3 - LISTING EMPLOYEES:
			
			System.out.println();
			System.out.println("List of employees:");
			for (Funcionario obj : list) {
				System.out.println(obj);
			}
					
			sc.close(); 
		}
		
		public static boolean hasId(List<Funcionario> list, int id) {
			Funcionario emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
			return emp != null;
		}
}
