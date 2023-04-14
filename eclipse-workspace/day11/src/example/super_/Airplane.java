package example.super_;

public class Airplane {
	
	public String planeCode;
	public int speed;
	public int gas;
	
	// speed 0, gas 100으로 고정, planeCode만 입력받는 생성자 정의
	public Airplane(String planeCode) {
		this.planeCode = planeCode;
		this.speed = 0;
		this.gas = 0;
	}
	
	// 최대속도를 900으로 설정해주세요. 호출시 연료는 3 차감, 속도 100씩 증가
	public void fly() {
		if (this.speed + 100 >= 900) {
			this.speed = 900;
			this.gas -= 3;
			return;
		}
		
		if(this.gas -3 < 0) {
			System.out.println("연료가 부족합니다.");
			return;
		}
		
		this.speed +=100;
		this.gas -= 3;
	}
	 
	// 계기판을 보는 메서드입니다. 현재 비행기 상태를 콘솔에 찍어주세요. 
	public void showStatus() {
		System.out.println("편명 : " + planeCode);
		System.out.println("속도 : " + speed);
		System.out.println("연료 : " + gas);
	}
}
