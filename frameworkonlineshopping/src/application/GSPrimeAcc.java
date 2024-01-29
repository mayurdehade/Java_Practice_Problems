package application;

import frameworks.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc {
	
	private static final float charges = 10.2f;

	public GSPrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
	}

	@Override
	public void bookProduct(float prod) {
		
		
	}

	@Override
	public String toString() {
		return "GSPrimeAcc []";
	}


	

	
	
}
