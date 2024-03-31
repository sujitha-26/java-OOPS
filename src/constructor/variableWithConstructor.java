package constructor;

class variables{
	int a=90;
	static String name="suji";
	//constructor:
	variables(){
		this.a=a;
		this.name=name;
	}
}

public class variableWithConstructor {
	public static void main(String[] args) {
	variables var=new variables();
	System.out.println(var.a);
	System.out.println(var.name);
	
	}	
}
