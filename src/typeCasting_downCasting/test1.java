package typeCasting_downCasting;

public class test1 {

	public static void main(String[] args) {
		
		A obj1=new B();
		System.out.println(obj1.i);
		//System.out.println(obj1.j);=CTE
		
		//downcast A type ref to B
		B obj2=(B)obj1;
		System.out.println("i: "+obj2.i);
		System.out.println("j: "+obj2.j);
		System.out.println("===============");
		
		//process by C TO A 
		A obj3=new C();
		System.out.println(obj3.i);
		//System.out.println(obj3.j);=CTE
		//System.out.println(obj3.k);=CTE
		
		//downcasting
		C obj4=(C)obj3;
		System.out.println("i: "+obj4.i);
		System.out.println("j: "+obj4.j);
		System.out.println("k: "+obj4.k);
		 
	}

}
