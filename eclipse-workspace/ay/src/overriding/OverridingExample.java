package overriding;

public class OverridingExample {
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.name = "김자바";
		s1.age = 34;
		s1.major = "컴퓨터과학";
		
		s1.자기소개하기();
		s1.코딩하기();
		
		Programer p1 = new Programer();
		
		p1.name = "박학생";
		p1.age = 23;
		p1.devLang = "자바";
		p1.jobYear = 4;
		
		p1.자기소개하기();
		p1.코딩하기();
	}

}
