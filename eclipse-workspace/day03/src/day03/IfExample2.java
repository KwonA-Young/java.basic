package day03;

public class IfExample2 {
	public static void main(String[] args) {
		
		int score = 87;
		
		if (score >= 90) {
			System.out.println("A학점입니다!");
		} else if (score >=80) {
			System.out.println("B학점입니다!");
		} else if (score >=70) {
			System.out.println("C학점입니다!");
		} else if (score >=60) {
			System.out.println("D학점입니다!");
		} else if (score >=50) {
			System.out.println("E학점입니다!");
		} else {
			System.out.println("F학점입니다.");
		}
	}

	
	


	int num = 7; // 입력값을 변수에 저장
	if (num == 0) { // 0인 경우
	    System.out.println("0입니다.");
	} else if (num > 0) { // 양수인 경우
	    if (num % 2 == 0) { // 짝수인 경우
	        System.out.println("짝수 양수입니다.");
	    } else { // 홀수인 경우
	        System.out.println("홀수 양수입니다.");
	    }
	} else { // 음수인 경우
	    System.out.println("음수입니다.");
	}
