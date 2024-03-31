package polymorphism;

public class Method_overloading {
	public static void demo() {
		System.out.println("No args");
	}
	public static void demo(int i) {
		System.out.println("int...");
	}
	public static void demo(double d) {
		System.out.println("Double...");
	}
	public static void demo(int i,double d) {
		System.out.println("int,double...");
	}
	public static void demo(double d,int i) {  //3)rule: different order
		System.out.println("double,int...");
	}
}
