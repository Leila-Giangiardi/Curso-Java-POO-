package application;

import entities.AccountUD;
import entities.BusinessAccountUD;
import entities.SavingsAccount;

public class ProgramUD {

	public static void main(String[] args) {

		AccountUD acc = new AccountUD(1001, "Alex", 0.0);
		BusinessAccountUD bacc = new BusinessAccountUD(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		AccountUD acc1 = bacc;
		AccountUD acc2 = new BusinessAccountUD(1003, "Bob", 0.0, 200.0);
		AccountUD acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		// DOWNCASTING
		
		BusinessAccountUD acc4 = (BusinessAccountUD)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if (acc3 instanceof BusinessAccountUD) {
			BusinessAccountUD acc5 = (BusinessAccountUD)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}