package day08;

public class BasketballPlayer {
	
	public String name;
	public int height;
	public int age;
	public int salary;
	
	
	// showInfo를 만들어주세요.
	// 호출시 위 4가지 요소를 콘솔에 찍어줍니다.
	
	public void showInfo() {
		System.out.println(name);
		System.out.println(height);
		System.out.println(age);
		System.out.println(salary)
	}
	
	public void dunkShoot() { // 덩크슛 하기 기능
		if (height > 190) {
			System.out.println("덩크슛 성공!");
		}else {
			System.out.println("골대에 안닿음.");
		}
	}

}
