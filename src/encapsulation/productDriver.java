package encapsulation;

public class productDriver {

	public static void main(String[] args) {
		product obj=new product();
		//obj.price=200;
		//System.out.println(obj.price);
		
		System.out.println(obj.getprice());
		obj.setprice(500);
		System.out.println(obj.getprice());

	}

}
