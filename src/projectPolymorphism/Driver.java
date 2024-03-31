package projectPolymorphism;

import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		//cab c1=new cab();
		//c1.thanks();
		
		//cab c2=new mini();//upcasting
		//c2.thanks();//printing child class members due to method overriding 
		
		ola o=new ola();
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Mini");
		System.out.println("2.sedan");
		System.out.println("3.prime");
		System.out.println("Enter the choice");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
		{
			o.bookcab(new mini());
			break;
		}
		case 2:
		{
			o.bookcab(new sedan());
			break;
		}
		case 3:
		{
			o.bookcab(new prime());
			break;
		}
		default:{
			System.out.println("Enter valid number");
		}
		}
	}

}
