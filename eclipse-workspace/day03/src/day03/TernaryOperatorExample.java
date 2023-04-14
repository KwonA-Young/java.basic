package day03;

public class TernaryOperatorExample {
	public static void main(String[] args) {
		
		// 삼항 연산자는 (조건식 ? 결과1 : 결과2) 형식으로 작성하며
		//  당 위치에 조건이 참이면 결과1이, 거짓이면 결과2 수행.
		
		int height = 160;
		
		String result = (height < 130 ? "무료입장." : "유료입장");
		// 결국 남는건 나머지 다 지워지고  String result = "유료입장"
		
		System.out.println(result);  
		
		
	}

}
