package day03;

public class SwitchExample1 {
	package day03;

	import java.util.Scanner;
		
		public static void main(String[] args) {
			// 스캐너란 프로그램 실행 후 사용자에게 입력을 받는 기능을 가졌습니다.
			
			// 1. 스캐너 객체 생성
			Scanner scan = new Scanner (System.in);
			
			// 2. 스캐너 클래스가 가진 입력 기능을 이용해 값을 입력받음.
			System.out.println("메뉴를 번호로  입력해주세요!");
			System.out.println("1.카페라떼, 2. 아메리카노, 3. 프라푸치노");
			int order = scan.nextInt(); // int를 입력받을 때는 scan.nextInt()가 우변에 온다.
			
			switch (order) {
				case 1:
					System.out.println("주문하신 카페라떼가 나왔습니다.");
					break; // break라는 구문을 case의 마지막에 작성해야 코드가 흘러내리지 않는다.
				case 2:
					System.out.println("주문하신 아메리카노가 나왔습니다.");
					break;
				case 3:
					System.out.println("주문하신 프라푸치노가 나왔습니다.");
					break; // 마지막 case에는 break; 안달아도 상관없지만 가독성때문에 다는 경우도 있음.
				default:
					System.out.println("주문하신 상품은 없는 상품입니다.");
				
			}
			
}

}


}
