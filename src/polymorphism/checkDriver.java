package polymorphism;

public class checkDriver extends check_methodsInOverring {
	
	public static void test() {
		System.out.println("Static...");
	}
	public void demo() {
		System.out.println("non static...");
	}

	public static void main(String[] args) {
		//parent class invoking
		check_methodsInOverring cm=new check_methodsInOverring();
		cm.test();
		cm.demo();
		
		//child
		checkDriver cd=new checkDriver();
		cd.test();
		cd.demo();
		
		//upcasting
		check_methodsInOverring cd1=new checkDriver();
		cd1.test();//hence static method doesn't support overridden
		cd1.demo();
		
		//downcasting
		checkDriver cd2=(checkDriver)cd1;
		cd2.test();
		cd2.demo();
	}

}
