package playingWithObj_utilityclass;

public class student {
	String name;
	char className;
	public int mark1;
	public int mark2;

	student(String name){
		this.name=name;
	}
	student(char className){
		this.className=className;
	}
	student(int mark1,int mark2){
		this.mark1=mark1;
		this.mark2=mark2;
	}
	student(String name,char className,int mark1,int mark2){
		this.name=name;
		this.className=className;
		this.mark1=mark1;
		this.mark2=mark2;
	}
	
	
}
