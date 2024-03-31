package AbstractClass;

public abstract class student_abs 
{
	//concrete method
	public static void add(int a,int b) {
		int res=a+b;
		System.out.println(res);
	}
	
	//abstract method
	public abstract void addtwo(int a,int b);
	
	//Cannot instantiate the abstract class[type student_abs]
	public static void main(String[] args) {
		student_abs std=new student_abs();
	}
}
