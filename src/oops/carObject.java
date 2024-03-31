/*create one class
 * create 3 obj and the objects address are equal or not
 */
package oops;
class car{
	int TotSeats;
	String color;
}

public class carObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj1=new car();
		car obj2=new car();
		car obj3=new car();
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println((obj1==obj2)?("The address of obj1&2 are equal: "):("The address of obj1&2 are diff: "));
		System.out.println((obj2==obj3)?("The address of obj2&3 are equal: "):("The address of obj2&3 are diff: "));
		System.out.println((obj3==obj1)?("The address of obj3&1 are equal: "):("The address of obj3&1 are diff: "));
	}

}
