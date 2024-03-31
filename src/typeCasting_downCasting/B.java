package typeCasting_downCasting;

public class B extends A {
	int j=200;
	
	//constructor
	B(){
		
	}
	B(int j){
		this.j=j;
	}
	B(int i,int j){
		super(i);
		this.j=j;
	}
}
