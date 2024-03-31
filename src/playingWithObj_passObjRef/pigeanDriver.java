package playingWithObj_passObjRef;

public class pigeanDriver {
	public static void main(String[] args){
		pigean p=new pigean("pg",10);
		display(p);
		displayMembers(p);
	}
	public static void display(pigean p) {
		System.out.println("Printing the pigean class details(address)");
		System.out.println(p);
		System.out.println("==============");
	}
	public static void displayMembers(pigean p) {
		System.out.println("Printing the pigean class Members");
		System.out.println(p.getbreed()+" "+p.getage());
		p.setbreed("pg2");
		p.setage(46);
		System.out.println(p.getbreed()+" "+p.getage());
	}
}
