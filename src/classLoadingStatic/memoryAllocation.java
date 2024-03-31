package classLoadingStatic;

public class memoryAllocation {
	static int a;
	static int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			System.out.println("a:"+ a);
			System.out.println("b:"+ b);
		}
	}
		static {
			System.out.println("hi guys");
		}
	}


