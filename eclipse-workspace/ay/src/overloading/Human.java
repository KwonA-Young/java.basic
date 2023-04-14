package overloading;

public class Human {
	
	public String name;
	public int age;
	
	public Human() {
		name = "이름을 입력하지 않았습니다.";
		age = 2;
	}
	public Human(String n, int a) {
		name = n;
		age = a;
	}

}
