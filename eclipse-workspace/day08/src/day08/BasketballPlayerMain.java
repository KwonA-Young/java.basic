package day08;

public class BasketballPlayerMain {
	
	public static void main(String[] args) {
		// 농구선수 두명을 만들어주세요.
		// 한 명은 덩크슛에 성공하게
		// 다른 한 명은 실패하게 만들어주세요.
		
	BasketballPlayer p1 = new BasketballPlayer();
	p1.name = "이경아";
	p1.height = 187;
	p1.age = 32;
	p1.salary = 500;
	
	BasketballPlayer p2 = new BasketballPlayer();
	p2.name = "권효찬";
	p2.height = 195;
	p2.age = 30;
	p2.salary = 600;
	
	p1.showInfo();
	p1.dunkShoot();
	p2.showInfo();
	p2.dunkShoot();
		
		
	}

}
