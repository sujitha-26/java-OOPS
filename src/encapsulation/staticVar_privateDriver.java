package encapsulation;

public class staticVar_privateDriver {

	public static void main(String[] args) {
		staticVar_private obj=new staticVar_private();
		System.out.println(obj.getprice());
		obj.setPrice(255);
		System.out.println(obj.getprice());
		
	}

}
