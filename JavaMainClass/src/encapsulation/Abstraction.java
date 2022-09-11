package encapsulation;



public class Abstraction {
	public static void main(String[] args) {
		
		Audi a1 = new Audi();
		a1.start();
		
		

	}
	class Audi extends Car {
		
		@override
		void start () {
			
		}
		
	}
	
	class BMW extends Car {
		
		@override
		void start () {
			
		}
		
	}
	
	abstract class Car {
		 //String brand;
		 int price;
		 
		 abstact void start();// no need to explain implementation of abstact method
	}// only a concept
	
	void break() {
		
	}

}
