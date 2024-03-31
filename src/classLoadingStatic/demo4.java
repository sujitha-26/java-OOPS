package classLoadingStatic;

public class demo4 {
	public static int test() {
		System.out.println("a from test(): "+a);
		System.out.println("b from test(): "+b);
		return 10;
	}
	public static void main(String[] args) {
		System.out.println("main starts");
		test();
		System.out.println("main ends");
	}
	static int a;
	static int b=40;

}
