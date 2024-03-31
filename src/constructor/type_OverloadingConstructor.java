package constructor;

class car{
	int price;
	String color;
	double weight;
	//constructor: constructor having same name with diff parameter
	
			//types::
	car()//default constructor
	{
		System.out.println("No arg cons");	
		System.out.println(price+" "+color+" "+weight);
	}
	
	// this keyword ::
	car(String color)//parameterized constructor
	{
		color=color;
		//this.color=color;
		System.out.println(color);
	}
	car(int p,String color,double w){
		price=p;
		color=color;
		weight=w;
		System.out.println(p+" "+color+" "+w);
	}
	}

public class type_OverloadingConstructor {
	public static void main(String[] args) 
	{
		
		car obj1Car=new car(10,"blue",2.5);
		car obj2car=new car("red");
		System.out.println(obj2car.color);
		
		//obj2car.price=55;
	}
}
