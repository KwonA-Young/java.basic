package poly.inherit;

public class MainClass1 {
	public static void main(String[] args) {
		
		Warrior w1 = new Warrior("전사");
		Rat r1 = new Rat();
		Rabbit rab1 = new Rabbit();
		
		w1.hunt(r1);
		w1.hunt(rab1);
		w1.showStatus();
	}

}
