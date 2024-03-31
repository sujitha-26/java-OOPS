package polymorphism;

public class Driver_MOverriding {

	public static void main(String[] args) {
		methodOverriding1 parent=new methodOverriding1();
		parent.test();
		methodOverriding2 child=new methodOverriding2();
		child.test();
		methodOverriding1 upcast=new methodOverriding2();
		upcast.test();
		
	}

}
