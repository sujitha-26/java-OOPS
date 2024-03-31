package playingWithObj_returnObjRefFromMethod;

public class BoxDriver {

	public static void main(String[] args) {
		Box b1=Box.createBox();
		System.out.println(b1.length);
		
		//call parameterized obj
		Box b2=Box.createBox(78.5);
		System.out.println(b2.length);
	}

}
