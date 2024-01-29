package frameworks;

public abstract class PrimeAcc extends ShopAcc {
	
	//Fields
	private boolean isPrime;
	private static final float deliveryCharges = 10.00f;

	//constructor
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	@Override
	public abstract void bookProduct(float prod);

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
	
	

}
