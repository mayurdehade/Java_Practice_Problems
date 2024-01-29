package application;
import frameworks.ShopFactory;
import frameworks.PrimeAcc;
import frameworks.NormalAcc;

public class Executor {

	public static void main(String[] args) {
		
		ShopFactory gs = new GSShopFactory();
		
		PrimeAcc p = new GSPrimeAcc(520, "Mayur D", 200f, true);
		
		NormalAcc n = new GSNormalAcc(1001, "Mayur", 200f, 50f);
		
		System.out.println(p.getAccNm());
		
	}

}
