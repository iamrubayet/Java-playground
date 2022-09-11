package encapsulation;

public class OopJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Person p1 = new Person();
//		p1.name = "ruba";
//		p1.age = 23;
//		
//		Person p2 = new Person();// default constructor
////		p2.name = "jando";
////		p2.age = 23;
////		
//		Person p2 = new Person(23,"shovam");
//		
//		p1.eat();
//		p2.walk();
//		p2.walk(2);//compile time polymorphism
//		
//		System.out.println(Person.count);//count can only be accessed through class

		
		
		
		Encapsulation obj = new Encapsulation();
		
		obj.dowork();
	}

}

class Developer extends Person{
	public Developer(int age,String name) {
		super(age,name);
	}
	
	void walk() {
		System.out.println(name+"walked"+steps);
		
	}// method over ridding // runtime polymorphism // inheritance related
}

class Person {
	protected String name;// only child developer can access this
	int age;
	
	static int count=0;// this is a property of class not object
	
//	public Person() {
//		count++;
//		System.out.println('creating an object from default cons');//default cons
//	}
	
//	public Person(int newAge,String newName) {
//		this();
//		name = newName;
//		age = newAge;
//		
//		
//	}// for initializing vaules
	
	
	public Person(int age,String name) {
		this.age = age;
		this.name = name;
		
		
	}// this keyword
	
	
	void walk () {
		
	}
	
	void eat() {
		
	}
	void walk(int steps) {
		System.out.println(name+"walked"+steps);
		
	}
	
	void doWork() {
		
	}
	
}
