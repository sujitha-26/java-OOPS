package playingWithObj_passObjRef;
//passing object referance to a method

public class pigean {
	private String breed;
	private int age;
	
	public pigean(String breed,int age){
		this.breed=breed;
		this.age=age;
	}
	//GETTER FOR THE MEMBERS
	String getbreed() {
		return breed;
	} 
	int getage() {
		return age;
	}
	
	//SETTER FOR THE MEMBERS
	void setbreed(String breed) {
		this.breed=breed;
	}
	void setage(int age) {
		this.age=age;
	}

}
