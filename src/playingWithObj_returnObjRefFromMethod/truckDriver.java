package playingWithObj_returnObjRefFromMethod;

public class truckDriver {

	public static void main(String[] args) {
		truck t1=truck.factory();
		System.out.println(t1);
		System.out.println(t1.cargoCapacity);
		//truck.factory(5.5);
		//System.out.println(t1.cargoCapacity);
		truck t2=truck.factory(10.56);
		System.out.println(t2.cargoCapacity);
	}
}
