package day03;

public class ifQuiz {
	public static void main(String[] args) {
		
		/*
		 *  정수를 입력했을 때 음수라면 "음수입니다.", 양수라면 "양수입니다."
		 *  0이라면 "0입니다" 라고 출력하는 구문을 만들어주세요.
		 *  단, 양수인 경우는 짝수와 홀수를 구분해서
		 *  짝수라면 "짝수 양수입니다.", 홀수라면 "홀수 양수입니다."
		 *  라고 출력하도록 구분해주세요.
		 *  (힌트1: 나머지 연산자를 사용해서 구분할 수 있습니다.)
		 *  (힌트2: if문 내부에 if를 추가로 작성할 수 있습니다. )
		 */
		
			
		//강사님s(밑에꺼보다 이걸 더 추천)
		int number = 55;
		
		if (number < 0) {
			System.out.println("음수입니다.");
		} else if (number == 0) {
			System.out.println("0입니다.");
		} else if (number > 0 && (number %2 == 0)) {
			System.out.println("짝수 양수입니다.");
		} else if (number > 0 && (number % 2 != 0)) {
			System.out.println("홀수 양수입니다.");
		}
		
		//강사님s +힌트2 if문 중첩
		int number2 = 55;
		
		if (number2 < 0) {
			System.out.println("음수입니다.");
		} else if (number2 == 0) {
			System.out.println("0입니다.");
		} else {
			if (number2 % 2 == 0) {
				System.out.println("짝수 양수입니다.");
			} else if (number2 % 2 != 0) {
				System.out.println("홀수 양수입니다.");
			}
		}
		
		
		//아영s
		int number1 = 32; //(임의의 값을 여러분들이 배정해주세요.)
		
		if (number1 == 0) {
			System.out.println("0입니다.");
		} else if (number1 < 0) {
			System.out.println("음수입니다.");
		} else if (number1 > 0) {
			System.out.println("양수입니다.");
			if (number1 % 2 == 0) {
				System.out.println("짝수 양수입니다.");
			}
		}
	}
}
