package application;

import framework.BankFactory;
import framework.SavingAcc;
import framework.CurrentAcc;

public class Executor {

	public static void main(String[] args) {
		BankFactory bnk = new MMBankFactory();
		
		SavingAcc s = new MMSavingAcc(213, "Mayur", 5000f, true);
		
		CurrentAcc c = new MMCurrentAcc(458, "Neeraj", 10000f, 500);
		
		s.withdraw(100);
		s.toString();

	}

}
