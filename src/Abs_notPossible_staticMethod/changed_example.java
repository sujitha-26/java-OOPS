package Abs_notPossible_staticMethod;
//Java program to demonstrate
// abstract static method

import java.io.*;
public class changed_example {
	// super-class A
	abstract class A 
	{

		// static method func
		static void func()
		{
			System.out.println(
				"Static method implemented.");
		}

		// abstract method func1
		// it has no body
		abstract void func1();
	}

	// subclass class B
	class B extends A {

		// class B must override func1() method
		void func1()
		{
			System.out.println(
				"Abstract method implemented.");
		}
	}

	// Driver class
	public class Demo {
		public static void main(String args[])
		{

			// Calling the abstract
			// static method func()
			B.func1();
			B b = new B();
			b.func1();
		}
	}

}
