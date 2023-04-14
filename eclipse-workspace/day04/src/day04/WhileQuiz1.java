package day04;

import java.util.Scanner;

public class WhileQuiz1 {
	public static void main(String[] args) {
		
		// 컴퓨터랑 스무고개 수 맞추기
		int count = 1;
		
		// 스캐너를 생성해주세요
		Scanner scan = new Scanner(System.in);
		
		System.out.println("최대 범위가 될 숫자를 입력해주세요.");
		int maxValue = scan.nextInt() + 1;
		
		// 이 프로그램은 먼저 Math.random()을 이용해서 수를 하나 얻습니다.
		int comValue = (int)(Math.random() * maxValue); // 0 ~ maxValue-1 숫자 하나 선택됨
		
		System.out.println("0 ~ " + (maxValue - 1) + " 사이의 숫자를 입력해주세요.");
		// 사용자에게 숫자를 입력받게 해주세요.
		
		// 자바에서는 연속해서 변수를 선언하는 것이 불가능하므로
		// 반복문 바깥에서 선언해주고, 반복문 내부에서는 선언된 변수 값을 바꿔넣기만 한다.
		int userValue = -1;
		
		do {
			userValue = scan.nextInt();
		}while(userValue > (maxValue -1) || userValue < 0);
	}

}
