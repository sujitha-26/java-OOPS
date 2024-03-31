package Inheritance_Is_A_Relationship;

public class static_Driver {

	public static void main(String[] args) {
		//access static members by subclass;
		System.out.println("Variable invoke by class name"+static_subclass.a);
		//System.out.println(a);=>CTE
		static_subclass.action();
		
		
		
		System.out.println("======= By obj referance =======");
		//create obj and access static members by superclass;
		static_superclass obj1=new static_superclass();
		System.out.println(obj1.a);
		static_superclass.action();
		
		System.out.println("After this keyword");
		static_superclass obj2=new static_superclass(34);
		System.out.println(obj2.a);
		
		
	}

}
