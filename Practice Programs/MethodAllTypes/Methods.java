package sample;

public class Methods {

	public void addition() { // without parameters without return
		int x = 10, y = 20;
		System.out.println("Sum is :" + (x + y));
	}

	int parameters(int x, int y) { // with parameters with return
		return x + y;
	}

	void withoutReturn(int x, int y) { // with parameters without return
		System.out.println("Sum is :" + (x + y));
	}

	int withReturnValue() { // without parameters with return
		int x = 6, y = 8;
		return x + y;

	}

	public static void main(String[] args) {
		System.out.println("Hello World");
		Methods m = new Methods();
		m.addition();
		System.out.println("Sum with parameters : " + m.parameters(5, 5));
		m.withoutReturn(3, 6);
		System.out.println("Sum without parameters : " + m.withReturnValue());

	}
}
