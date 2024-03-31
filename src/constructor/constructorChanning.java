package constructor;
/*class student{
	String name;
	int id;
	int age;
	
	student(){
		
	}
	student(String name){
		this.name=name;
		System.out.println(name);
	}
	student(String name,int id){
		this(name);
		this.id=id;
		System.out.println(name+" "+id);
	}
}*/
class demo {
	int i;
	String str;
	
	
	
	demo(){
		System.out.println("1st constructor");
		
	}
	demo(int i){
		this();
		this.i=i;
		System.out.println(i);
		
	}
	demo(String str){
		//this(i);
		this.str=str;
		System.out.println(str);
		//this(i);this()method should not be last;
	}
	private void demo() {
		
		
	}
	
}
public class constructorChanning {
	public static void main(String[] args) {
	demo obj=new demo(10);
	System.out.println("================");
	demo obj1=new demo("suji");
	//student obj3=new student("sujitha",100);

}
}
