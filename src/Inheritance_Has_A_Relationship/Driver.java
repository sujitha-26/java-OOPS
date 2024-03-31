package Inheritance_Has_A_Relationship;

public class Driver {

	public static void main(String[] args) {
		car c=new car("rolls roys");
		//c.modelname="RR";
		
		//fetch and print car modelname 
		System.out.println(c.modelname);
		
		//fetch and print hp by car model
		System.out.println(c.e.gethp());
		c.e.sethp(1400);
		System.out.println(c.e.gethp());
	}

}
