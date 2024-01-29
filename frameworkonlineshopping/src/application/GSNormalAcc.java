package application;

import frameworks.NormalAcc;

public class GSNormalAcc extends NormalAcc {

	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges, deliveryCharges);
	}

	@Override
	public void bookProduct(float prod) {
		
	}

	@Override
	public String toString() {
		return "GSNormalAcc []";
	}
	
	
}
