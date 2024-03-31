package Inheritance_Has_A_Relationship;

public class engine {
	private double hp;//horse power
	
	//getter and setter for hp
	public double gethp(){
		return hp;
	}
	
	public void sethp(double hp) {
		this.hp=hp;
	}
	
	//constructors
	engine(){
		
	}
	
	engine(double hp){
		//this.hp=hp;
		sethp(hp);
	}

	
}
