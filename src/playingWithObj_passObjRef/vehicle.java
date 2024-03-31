package playingWithObj_passObjRef;

public class vehicle {
		//instance var for vehicles:
		private String model;
		private int year;
		
		vehicle(String model,int year){
			this.model=model;
			this.year=year;
		}
		
		//getter method for model and year;
		String getmodel() {
			return model;
		}
		int getyear() {
			return year;
		}
		
		//setter to the members
		void setmodel(String model) {
			this.model=model;
		}
		void setyear(int year) {
			this.year=year;
		}
}
