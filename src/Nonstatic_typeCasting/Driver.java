package Nonstatic_typeCasting;

public class Driver {

	public static void main(String[] args) {
		//person class ref
		person p1=new person();
		System.out.println(p1);
		System.out.println(p1.name);
		//System.out.println(p1.sid);
		System.out.println("====");
		//student class ref
		student s1=new student();
		System.out.println(s1.name);
		System.out.println(s1.sid);
		
		student s=new student(26);
		person p=s;
		
		System.out.println(p);
		System.out.println(s);
		
		System.out.println(p.name);
		//System.out.println(p.sid);=>C.T.E
	}
 
}
