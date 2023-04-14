package day08;

public class Cat {

	public String name;
	public String kind;
	public String color;
	public int age;
	
	public Cat(String n,String k, String c, int a) {
		name = n;
		kind = k;
		color = c;
		age = a;
	}
	
	// 설계 클래스 내부에 선언하는 메서드는 static을 쓰지 않습니다.
	public void showCatInfo() {
		System.out.println(name);
		System.out.println(kind);
		System.out.println(color);
		System.out.println(age);
		
	}
}
