package day06;

public class ForStarQuiz3_2 {
	
	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	public static void main(String[] args) {
		// 중첩 반복문을 쓰되, if문으로 " "와 "*"을 통제
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5; k++) {
				// i의 값은 고정이고 5-k로 1부터 5까지 돌렸을 때, 첫텀ㅇ에 4개가 true가 나오게 설
				if (i <= 5 - k) {
					System.out.println("  ");
				} else {
					System.out.println("*");
				}
			}
			System.out.println();
		}
	}

}
