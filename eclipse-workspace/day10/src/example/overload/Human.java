package example.overload;


public class Human {
		
		public String name;
		public int age;
		
		// 생성자 오버로딩은 생성자를 여러 유형으로 만드는 것
		// 파라미터는 () -> void 파라미터
		//         (String, int)
		// 두 유형어로 만들어보겠습니다.
		
		public Human() {
			name = "이름을 입력하지 않았습니다.";
			age = 19;
		}	
		public Human(String n, int a) {
			name = n;
			age = a;
		}
		
		
		
		// Human 이름 똑같고 () 안에 String n, int a 
		//						개수 다르니까 오버로딩
}