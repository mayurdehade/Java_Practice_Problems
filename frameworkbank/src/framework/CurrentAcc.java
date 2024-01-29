package framework;

public abstract class CurrentAcc extends BankAcc {
	
	
	private final float creditLimit;

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	@Override
	public void withdraw(float amount) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	


	
	
	
}
