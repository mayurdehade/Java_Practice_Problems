package application;

import framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL = 1000;

	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		
	}

	@Override
	public void withdraw(float amount) {
		
	}

	@Override
	public void deposite(float amount) {
		
	}

	

}
