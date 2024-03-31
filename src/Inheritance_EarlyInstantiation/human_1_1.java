package Inheritance_EarlyInstantiation;

public class human_1_1 {
	String name;
	int age;
	
	//constructor
	human_1_1(){
		
	}
	human_1_1(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public static void speak() {
		System.out.println("human can speak");
	}
	heart_1_1 hrt=new heart_1_1(true);
}
