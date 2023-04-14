package overloading;

public class HumanMain {
	public static void main(String[] args) {
		
		Human h1 = new Human();
		System.out.println(h1.name);
		System.out.println(h1.age);
		
		Human h2 = new Human("권아영", 26);
		System.out.println(h2.name);
		System.out.println(h2.age);
	}

	
	}

