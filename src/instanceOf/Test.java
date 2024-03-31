package instanceOf;
// instance means it check whether the object was in given types or not  
public class Test {
	public static void main(String[] args) {
		Object obj=new A();
		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
		System.out.println(obj instanceof D);
		
		System.out.println("============");
		Object obj1=new D();
		System.out.println(obj1 instanceof Object);
		System.out.println(obj1 instanceof A);
		System.out.println(obj1 instanceof B);
		System.out.println(obj1 instanceof C);
		System.out.println(obj1 instanceof D);
		
		System.out.println("============");
		Object obj2=new C();
		System.out.println(obj2 instanceof Object);
		System.out.println(obj2 instanceof A);
		System.out.println(obj2 instanceof B);
		System.out.println(obj2 instanceof C);
		System.out.println(obj2 instanceof D);
		
		System.out.println("============");
		Box b1=new Box();
		System.out.println(b1 instanceof Object);
		System.out.println(b1 instanceof Box);
		System.out.println(b1 instanceof A);
		// this error is because whether the BOX object is not have any is a relationship between B and Box class  
		//System.out.println(b1 instanceof B);
		System.out.println(b1 instanceof C);
		System.out.println(b1 instanceof D);
	}
}
