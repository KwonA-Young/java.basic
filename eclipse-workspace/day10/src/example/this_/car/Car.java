package example.this_.car;

public class Car {
	
	public String model;
	public int speed;
	
	public Car(String model) {
		this.model = model;
		this.speed = 0;
	}
	
	public void accel () {
		if (speed + 10 >= 150) {
			speed = 150;
		} else {
			speed += 10;
		}
	}
	void showStatus() {
		System.out.println("모델명 : " + this.model);
		System.out.println("현재속도 : " + this.speed);
	}
}
