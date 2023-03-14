public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class A {
     void methodOne(int i) {
    }

    public void methodTwo(int i) {
    }

    public static void methodThree(int i) {
    }

    public static void methodFour(int i) {
    }
}

class B extends A {
  //  static void methodOne(int i) {}

    public void methodTwo(int i) {
    }

    public static void methodThree(int i) {
    }

    public static void methodFour(int i) {
    }
}

class Parent {
    public static void staticMethod() {
        System.out.println("This is a static method in Parent class.");
    }
}

class Child extends Parent {
    public static void staticMethod() {
        System.out.println("This is a static method in Child class.");
    }
}

 class Maina {
    public static void main(String[] args) {
        Parent.staticMethod(); // Output: This is a static method in Parent class.
        Child.staticMethod(); // Output: This is a static method in Child class.
    }
}