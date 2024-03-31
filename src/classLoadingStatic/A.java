package classLoadingStatic;

public class A {

	public static void main(String[] args) {
		System.out.println("main() of A");
	}
	static {
		System.out.println("from static of A");
	}

}
