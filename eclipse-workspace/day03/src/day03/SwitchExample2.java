package day03;

public class SwitchExample2 {
	
	public static void main(String[] args) {
		// 앞서 배운 배열과 연동해서 코드를 작성해보겠습니다.
		String[] foods = {"삼겹살", "초밥", "베이징덕", "팟씨유", "커리"};
		
		// 0~4 범위의 난수를 얻도록 해주세요.
		
		// 최애 3개 요리는 case에서 체크해서
		// "xx식입니다." 라고 출력하게 해주시고
		// 나머지 2개가 걸린 경우는 default문을 이용해 "기타요리입니다."라고 출력해주세요.
		// 힌트: case 요리명:
		
		int idx = (int)(Math.random() * 5);
		
		// 예시
		System.out.println(foods[idx]);
		switch(foods[idx]) {
			case "삼겹살":
				System.out.println("한식입니다.");
			break;
			case "초밥":
				System.out.println("일식입니다.");
			break;
			case "베이징덕":
				System.out.println("중식입니다.");
			default:
				System.out.println("기타요리입니다.");
				
				//아영ver
				
				switch (foods[idx]) {
					case "삼겹살":
						System.out.println("한식입니다.");
						break;
					case "초밥":
						System.out.println("일식입니다.");
						break;
					case "베이징덕":
						System.out.println("중식입니다.");
					default:
						System.out.println("기타요리입니다.");
					
				
		
		}
		
		
		
		
	
		
		
		
		}
		
	}

