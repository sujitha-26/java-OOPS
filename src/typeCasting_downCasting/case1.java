package typeCasting_downCasting;

public class case1 {
	public static void main(String[] args) {
		//Upcasting
		Cab b=new Mini();
		System.out.println(b.str);
		//System.out.println(b.Mini);
		
		//DownCasting
		Mini M=(((Mini)b));
		System.out.println("M val: "+M);
		System.out.println(((Mini)b).str);
	}
}
