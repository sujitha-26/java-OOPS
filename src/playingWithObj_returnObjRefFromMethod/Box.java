package playingWithObj_returnObjRefFromMethod;

public class Box {
	double length;
	
	Box(){
		
	}
	Box(double length){
		this.length=length;
	}
	
	public static Box createBox() {
		Box b = new Box();
		return b;
	}
	public static Box createBox(double length) {
		Box b = new Box(length);
		return b;
	}
	
}
