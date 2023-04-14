package day08;

public class CatMain {
	public static void main(String[] args) {
		
		Cat c1 = new Cat("후추", "코숏", "회갈색",5);  // <- 생성자 생성하고 main에서 이렇 괄호 안에 넣으면
		
		
		//c1.name = "후추";
		//c1.kind = "코숏";
		//c1.color = "회갈색";
		//c1.age = 5;
		// 위에 네 줄 안쓰고 한줄에 쓸 수 있음. : 생성자 장점
		
		
		
		
		/* Cat c2 = new Cat();
		 *c2.name = "루시";
		 *c2.kind = "코숏";
		 *c2.color = "검정색";
		 *c2.age = 8;
		 *이렇게 할 거 생성자 쓰면 
		*/
		
		Cat c2 = new Cat("루시", "코숏", "검정색",8);
		//이렇게 한 줄로 만들 수 있답니당~
		
		c1.showCatInfo();
		c2.showCatInfo();
		
		
}
}
	
