package prog7;
import prog7.employeeinfo.Employee;

import java.util.Arrays;





public class Main {

	Employee[] emps;

	public static void main(String[] args) {
		new Main();
	}
	Main(){
		emps = new Employee[3];
		emps[0] = new Employee("Jim Daley", 2000, 9, 4);
		emps[1] = new Employee("Bob Reuben", 1998, 1, 5);
		emps[2] = new Employee("Susan Randolph", 1997, 2,13);

		emps[0].createNewChecking(10500);
		emps[0].createNewSavings(1000);
		emps[0].createNewRetirement(9300);
		emps[1].createNewChecking(34000);
		emps[1].createNewSavings(27000);
		emps[2].createNewChecking(10038);
		emps[2].createNewSavings(3000);
		emps[2].createNewRetirement(9000);

		//using Comparable implementation on Employee
		//to sort emps
		Arrays.sort(emps);
		System.out.println(Arrays.toString(emps));

	}

}

class hola{
	public static int test(String sr){
		if(sr==null||sr.equals("")){
			return 0;
		}
		return 1+ test(sr.substring(1));
	}
	public static void main(String[] args) {
		System.out.println(test("java"));
	}
}
 class A {
	 public static String reverse(String input){
		 if(input==null||input.equals("")){
			 return "";
		 }
		 return reverse(input.substring(1))+input.charAt(0);
	 }
	String name;
	A(String name) {
		this.name = "Hello " + name;
	}
	public static void main(String[] args) {
		A h = new A("World");
		System.out.println(reverse(h.name));
	}
	//Singleton sin =   Singleton.getInstance();
}

abstract class Animal {
	abstract String animalSound();
}

class Pig extends Animal {
	public String animalSound() {
		return "The pig says: wee wee";
	}
}

class Dog extends Animal {
	public String animalSound() {
		return "The dog says: bow wow";
	}
}

