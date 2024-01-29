package framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private static final float MINBAL = 1000f;

	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public abstract void withdraw(float amount);

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", toString()=" + super.toString() + "]";
	}
	
	

	
	
	
	

}
