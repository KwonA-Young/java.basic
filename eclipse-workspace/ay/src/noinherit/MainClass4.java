package noinherit;

public class MainClass4 {
	
	public static void main(String[] args) {
		Pig p1 = new Pig();
		Pig p2 = new Pig();
		
		Magician m1 = new Magician("클라우드매지션");
		
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.huntPig(p1);
		m1.huntPig(p1);
		
		m1.showStatus();
		
		
	}

}
