package example.overload;
	/*
 	* 실습해보세요 2

	생성자와 일반 메서드를 모두 오버로딩해보겠습니다.

	생성자는 아무것도 입력 안 하면 0, “null”등의 대신 다른 기본 값이 대입되고
	
	String을 입력하면 “지금부터 이 아이의 이름은 XX입니다” 라고 나오게 해 주세요.

	고양이는 품종, 이름을 가집니다.

	call 메서드를 이용해 고양이를 부를 수 있는데

	void파라미터인 call메서드 경우 “야옹아 이리와” 라고 나오고
	
	String이 입력된 파라미터인 call 메서드인 경우 XX아 이리와 라고 출력해주세요.

	example.overload.Cat 클래스 기준으로 진행해주세요.
	 */


public class Cat {
	
	public String name;
	public String breed;
	
	public Cat() { //void 생성자 : (public Cat 뒤에 괄호에 아무것도 없는 거
		name = "이름을 입력해주세요.";
		breed = "품종을 입력해주세요.";
	}
	
	public Cat (String n, String b) {
		name = n;
		breed = b;
		System.out.println("지금부터 이 아이의 이름은 " + name + "입니다.");
	}
	
	public void call() {
		System.out.println("야옹아 이리와");
	}
	
	public void call (String catname) {
		System.out.println(catname + "아 이리와");
	}


}
