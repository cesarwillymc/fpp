
/*
class ParentClass {
    public static void staticMethod() {
        System.out.println("Parent class static method");
    }

    public static int staticVariable = 10;

    public int getStaticVariable(){
        return staticVariable;
    }
}

class ChildClass extends ParentClass {
    public static void staticMethod() {
        System.out.println("Child class static method");
    }
}

public class TheClass {
    public static void main(String[] args) {
        // Calling the static method of the parent class
        ParentClass.staticMethod(); // Output: Parent class static method

        // Calling the static method of the child class
        ChildClass.staticMethod(); // Output: Child class static method

        // Accessing the static variable of the parent class using the class name
        System.out.println(ParentClass.staticVariable); // Output: 10

        // Accessing the static variable of the parent class using an instance of the class
        ParentClass parentObj = new ParentClass();
        System.out.println(parentObj.staticVariable); // Output: 10

        // Attempting to access the static variable of the parent class using an instance method of the class
        // This will result in a compiler error since static variables cannot be accessed by instance methods
        parentObj.staticVariable = 20; // Compilation error
        System.out.println(parentObj.getStaticVariable()); // Output: 10

    }
}

class aaa {
    static int count = 0;

    public void printCount() {
        System.out.println(this.count);  // This will result in a compilation error
    }
}*/
class Parent{
    void run() {
        System.out.println("Run for 5 miles.");
    }
}
 class Child extends Parent{

    @Override
    void run() {
        System.out.println("Run for 1 mile.");
    }

    void rest() {
        System.out.println("Rest for 1 hour.");
    }
}
  class Main{
    public static void main(String[] args) {
        Child c = new Child();
        Parent p = c;
        p.run();
       // p.rest();
    }
}