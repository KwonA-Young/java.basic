package poly.inherit;

public class MainClass1 {
	
	public static void main(String[] args) {
		
		// 워리어1 생성 후 쥐, 토끼랑 교전
		Warrior w1 = new Warrior("다형성전사");
		Rabbit r1 = new Rabbit();
		Rat rat1 = new Rat();
		
		w1.showStatus();
		
		w1.hunt(r1);
		w1.hunt(r1);
		
		w1.showStatus();
		
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.hunt(rat1);
		w1.showStatus();
	}

}
