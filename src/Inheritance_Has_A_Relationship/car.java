package Inheritance_Has_A_Relationship;

public class car
{
	String modelname;
	
	car(){
		
	}
	
	car(String modelname){
		this.modelname=modelname;
		
	}
	
	//To archieve has a relationship
	engine e=new engine(1200);
}
