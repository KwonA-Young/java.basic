package overriding;

public class Programer extends Human {
	
	public String devLang;
	public int jobYear;
	
	public void 코딩하기() {
		System.out.println(devLang + "언어를 이용해 코딩해요.");
	}
	
	public void 자기소개하기() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println(devLang + " " + jobYear + "년차 개발자입니다.");
		}

}
