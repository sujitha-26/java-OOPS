package playingWithObj_passObjRef;

public class vehicleDriver {

	public static void main(String[] args) {
		vehicle vec=new vehicle("RR",90);
		show(vec);
		showMem(vec);
	}
	public static void show(vehicle vec) {
		System.out.println("Showing the vechicle class address: "+vec);
	}
	public static void showMem(vehicle vec) {
		System.out.println("Showing the vechicle class Members: ");
		System.out.println(vec.getmodel());
		System.out.println(vec.getyear());
		vec.setmodel("mec");
		vec.setyear(300);
		System.out.println("After set method processed: ");
		System.out.println(vec.getmodel());
		System.out.println(vec.getyear());
	}

}
