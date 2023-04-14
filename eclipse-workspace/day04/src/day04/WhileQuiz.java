package day04;

import java.util.Scanner;

public class WhileQuiz {
	// 컴퓨터랑 스무고개 수 맞추기
	
	// 이 프로그램은 먼저 Math.random()을 이용해서 수를 하나 얻습니다.
	int comValue = (int)(Math.random() * 101); // 0~100 숫자 하나 선택됨
	
	// 스캐너를 생성해주세요. 
	Scanner scan = new Scanner (System.in);
	
	// 사용자에게 숫자를 입력받게 해주세요.
	int userValue = scan.nextInt();
	
	// 컴퓨터의 값과 유저의 값이 일치해야만 종료하므로, 불일치시에는 계속 진행하도록처리
	while(comValue != userValue) {
		// 불일치라면 먼저 업인지, 다운인지 알려주기
		// comValue와 userValue의 비교를 통해 업/다운을 판단할 수 있다. 
		if(userValue < comValue) {
			System.out.println("Up");
		} else (userValue > comValue) {
			System.out.println("Down");
		}
		// 사용자한테 userValue를 다시 입력받기
		System.out.println("다시 입력해주세요.");
		userVaule = scan.nextInt();
	
	

}

}