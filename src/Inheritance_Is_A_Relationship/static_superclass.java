package Inheritance_Is_A_Relationship;

public class static_superclass {
	//static variable...
	static int a;
	
	static_superclass(){
		System.out.println("Static Inheritance_constructors NoArg...");
	}
	static_superclass(int a){
		this.a=a;
		System.out.println("Static Inheritance_constructors parametarised...");
	}
	
	//static method...
	public static void action() {
		System.out.println("static Inheritance_Method...");
	}
}
