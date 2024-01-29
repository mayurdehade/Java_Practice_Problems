package application;

import framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	@Override
	public void deposite(float amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(float amount) {
		super.withdraw(amount);
	}
	
	
	
}
