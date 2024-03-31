package Interface;

//Define the interface
interface MyInterface {
 void myMethod();
}

//Create a class that implements the interface
class MyClass implements MyInterface {
 @Override
 public void myMethod() {
     System.out.println("Implementation of myMethod in MyClass");
 }
}

//Create another class with a main method
public class MainClass {
 public static void main(String[] args) {
     // Create an instance of the class that implements the interface
     MyClass myObject = new MyClass();

     // Call the method defined in the interface
     myObject.myMethod();
 }
}
