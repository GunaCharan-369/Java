package oop;  

class One {
	int x = 10;
	
	void addition() {
	System.out.println("Sum is :" + (x+10));
	
	}
}

class Two extends One {
	
	 void subtraction() {
		 System.out.println("Diff is :" + (super.x-5));
	 }
}

class Three extends Two {
	
	void multiplication() {
		 System.out.println("Product is :" + (super.x-5));
	}
}

public class MultiLevel {
	public static void main(String [] args) {
		
		Three t = new Three();
	    t.addition();
	    t.subtraction();
		t.multiplication();
		
	}
}
