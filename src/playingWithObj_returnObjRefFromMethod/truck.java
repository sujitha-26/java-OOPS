package playingWithObj_returnObjRefFromMethod;

public class truck {
	double cargoCapacity;
	int bedLength;
	
	public truck(double cargoCapacity) {
		this.cargoCapacity=cargoCapacity;
	}
	public truck(int bedLength) {
		this.bedLength=bedLength;
	}
	public truck() {
		
	}
	public static truck factory() {
		truck trk1=new truck();
		return trk1;
	}
	public static truck factory(double cargoCapacity) {
		truck trk1=new truck(cargoCapacity);
		return trk1;
	}
	public static truck factory(int bedLength) {
		truck trk1=new truck(bedLength);
		return trk1;
	}
	
}