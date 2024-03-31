package Interface;

public interface Restrictions_Does_Doesnot {
	       //allowed...
	//final variable
	static final int f=20;
	
	//static method
	public static void demo(){
		
	}
	//non static method
	public void test();
	
	//nonstatic abstract method
	public abstract void demo1();
	
	private void t2() {
		
	}
	private static void t1() {
		
	}
	
	
	        //not_allowed...
	//static abstract
	//public static abstract void demo1();=>C.T.E}
	
	//static variable
	static int a=10;
		
	//non static variable
	int b=10;
	
	// modifier: other than public is not allowed
	public abstract void t3();
	
	
}
