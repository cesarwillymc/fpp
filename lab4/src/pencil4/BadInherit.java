package pencil4;


/**
 * RUNTIME TIME ERROR ->
 *
 * First -> When you execute the program BadInherit -> call the superclass-> enter the super class constructor
 * -> in the super class constructor called tu BadInherit and BadInherit -> call to superClass ..... ->... ->
 *
 * Enter in loop and throw Runtime error.
 * **/
public class BadInherit extends SuperClass {
    BadInherit(){
        System.out.println("In BadInherit");
    }
    public static void main(String[] args){
        new BadInherit();
    }
}
class SuperClass {
    SuperClass(){
        System.out.println("In SuperClass");
       // new BadInherit();
    }

}