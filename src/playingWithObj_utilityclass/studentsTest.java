package playingWithObj_utilityclass;

public class studentsTest {

	public static void main(String[] args) {
		//students obj=new students();
		
		student std1=new student(100,10);
		student std2=new student(467,100);
		student std3=new student(100,100);
		
		System.out.println("Total marks is: "+students.Totalmarks(std1));
		System.out.println("Average marks is: "+students.Avgmarks(std1));
		System.out.println("Minimum marks is: "+students.Minmarks(std1));
		System.out.println("Maximum marks is: "+students.Maxmarks(std1));
		
		System.out.println("===========================================");
		System.out.println("Total marks is: "+students.Totalmarks(std2));
		System.out.println("Average marks is: "+students.Avgmarks(std2));
		System.out.println("Minimum marks is: "+students.Minmarks(std2));
		System.out.println("Maximum marks is: "+students.Maxmarks(std2));
		
		System.out.println("===========================================");
		System.out.println("Total marks is: "+students.Totalmarks(std3));
		System.out.println("Average marks is: "+students.Avgmarks(std3));
		System.out.println("Minimum marks is: "+students.Minmarks(std3));
		System.out.println("Maximum marks is: "+students.Maxmarks(std3));
}
}
