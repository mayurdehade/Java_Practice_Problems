package frameworks;

public abstract class NormalAcc extends ShopAcc {

	private float deliveryCharges;
	
	//constructor
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	@Override
	public abstract void bookProduct(float prod);

	@Override
	public String toString() {
		return "NormalAcc []";
	}
	
	
	
	
	

	
	
}
