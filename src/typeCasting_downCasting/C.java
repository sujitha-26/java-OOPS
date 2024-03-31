package typeCasting_downCasting;

public class C extends B {
	int k=300;
	
	//constructor
	C(){
		
	}
	C(int k){
		this.k=k;
	}
	C(int i,int j,int k){
		super(i,j);
		this.k=k;
	}
}
