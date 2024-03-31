package playingWithObj_copyingObjRef;

//import playingWithObj.fruit;
class fruit {
	String fruitName;
	
	fruit(String fruitName){
		this.fruitName=fruitName;
		System.out.println(fruitName);
	}
}
public class example1 {
	public static void main(String[] args) {
		fruit obj = new fruit("apple");
		//System.out.println(fruitName);
		System.out.println(obj.fruitName);
		fruit obj1=obj;
		System.out.println(obj1);
		System.out.println(obj==obj1);

	}
}
