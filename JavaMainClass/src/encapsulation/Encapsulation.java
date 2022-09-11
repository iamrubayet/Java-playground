package encapsulation;

public class Encapsulation {
	
	public static void main(String[] args) {

	    Laptop l1 = new Laptop();
	    l1.price = 23;
		l1.setPrice(23);
	}
	
	public void dowork() {
		
	}
	
    private void dowork2() {
		
	}
    
    
    class Laptop {
    	int ram;
    	private int price;
    	
    	public void setPrice(int price) {
    		// is the user admin
    		this.price = price;
    		
    	}// getter and setter to access this private data;
    }

}
