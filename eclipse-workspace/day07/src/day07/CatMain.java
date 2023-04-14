package day07;

public class CatMain {
		
		// 고양이를 조회하는 용도로 사용할 전용 메서드를 작성해보겠습니다.
		public static void  showCatInfo(Cat cat) {
			System.out.println("고양이 이름 :" + cat.name);
			System.out.println("고양이 무게 :" + cat.weight);
			System.out.println("고양이 색깔 :" + cat.color);
			System.out.println("고양이 나이 :" + cat.age);
		}
	
	
	public static void main(String[] args) {
		// 고양이를 한마리 생성해보겠습니다.
		
		Cat c1 = new Cat();
		
		c1.name = "후추";
		c1.weight = 8;
		c1.color = "회갈색";
		c1.age = 5;
		
		showCatInfo(c1);
		
		// c2, c3을 새롭게 생성해주시고
		// 이 고양이들도 showCatInfo로 조회할때
		// 메모리 구조가 어떻게 전개될지 직접 그려보기 해주세요.
		// c1, c2, c3를 조회하는 각각의 순간
		// 3장의 메모리 구조 그림을 보내주세요.
	
		Cat c2 = new Cat();
	
		c2.name = "야옹이";
		c2.weight = 5;
		c2.color = "검정색";
		c2.age = 3;
		
		showCatInfo(c2);
		
		Cat c3 = new Cat();
		
		c3.name = "쵸리";
		c3.weight = 7;
		c3.color = "갈색";
		c3.age = 4;
		
		showCatInfo(c3);
	
	}

}

