package encapsulation;

public class staticVar_private {
	private static int price;
	
	double getprice() {
		return price;
	}
	
	void setPrice(int price) {
		this.price=price;
	}

	public double setprice() {
		
		return 0;
	}
}
