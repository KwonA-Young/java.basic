package overriding;

public class Student extends Human{
	
	public String major;
	
	@Override
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}
}
