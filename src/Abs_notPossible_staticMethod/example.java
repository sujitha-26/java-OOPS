package Abs_notPossible_staticMethod;
//Java program to demonstrate
// abstract static method
	 
import java.io.*;
public class example {
	 
	// super-class A
	abstract class A {
	 
	    // abstract static method func
	    // it has no body
	    abstract static void func();
	}
	 
	// subclass class B
	class B extends A {
	 
	    // class B must override func() method
	    static void func()
	    {
	        System.out.println(
	            "Static abstract"
	            + " method implemented.");
	    }
	}
	 
	// Driver class
	public class Demo {
	    public static void main(String args[])
	    {
	 
	        // Calling the abstract
	        // static method func()
	        B.func();
	    }
	}
}
