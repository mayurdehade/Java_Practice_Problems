package frameworks;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	//constructor
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}
	
	//getter setter
	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}
	
	abstract public void bookProduct(float prod);
	
//	abstract public void items(float ite);

	//toString method
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	

	
	
	
	
}
