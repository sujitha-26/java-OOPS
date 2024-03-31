package playingWithObj_passObjRef;
//passing object reference to method
class Driver{

}
class carDriver{
	
}

public class example1 {
	public static void display(Driver obj_ref, Driver obj_ref2,carDriver obj_ref3) {
		System.out.println("this is non static class...");
		System.out.println("this is obj referance of driver: "+obj_ref+" "+obj_ref2+" "+obj_ref3);
	}
		
	//@SuppressWarnings("unused")
	public static void main(String[] args) {
		Driver obj=new Driver();
		Driver obj1=new Driver();
		carDriver obj3=new carDriver();
		display(obj,obj1,obj3);
		System.out.println(obj);
		System.out.println(obj1);
	}
}