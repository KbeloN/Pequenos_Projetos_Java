package inicio;

import model.entities.Account;
import model.entities.BusinessAccount;
import model.entities.SavingsAccount;

public class Principal {

	public static void main(String[] args) {

		Account acc = new Account(1, "alex", 10.00);
		BusinessAccount bacc = new BusinessAccount(2, "maria", 10.00, 500.00);
		
		//UPCASTING
		
		Account acc1 = new BusinessAccount(1000, "pedro", 0.0, 500.00);
		Account acc2 = bacc;
		Account acc3 = new SavingsAccount(1001, "ADRIANA", 0.0, 0.02);
		
		//Downcasting
		
		BusinessAccount acc4 = (BusinessAccount)acc1;
		//acc1.loan(100.0);
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3 <-- Não é uma businessAccount
		
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(100.0);
			System.out.println("Loan!");
		}
		if(acc3 instanceof BusinessAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}
}
