package poly.inherit;

public class MainClass2 {
	public static void main(String[] args) {
		
		Magician m1 = new Magician();
		Rat r1 = new Rat();
		
		m1.hunt(r1);
		m1.hunt(r1);
		m1.hunt(r1);
		m1.showStatus();
		m1.castFireball();
		m1.showStatus();
		
	}

}
