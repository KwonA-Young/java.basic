package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuiz {
	public static void main(String[] args) {
		/*
		 * <로그인 입력값 검증>
		 * 
		 * 1. 입력받은 아이디가 맵에 입력된 키값에 
		 * 	  해당하는지의 여부를 검사하여 (containsKey 메서드 활용)
		 * 2. 맞다면 다시 한번 비밀번호의 값과 비교하여 비밀번호도 일치하면
		 *    "로그인 성공"을 콘솔에 출력하고 반복문 탈출
		 * 3. 비밀번호가 다르다면 "비밀번호가 틀렸습니다."를 출력
		 * 4. 입력받은 아이디가 맵에 입력된 키값이 아니라면
		 *    "아이디가 존재하지 않습니다."를 출력 
		 */
		
		//문제 : Scanner를 이용해서 아이디와 비밀번호를 입력받으면
		//	    미리 생성된 HashMap에 저장합니다.
		//		그리고 입력이 완료되면 ID와 PW를 다시 물어봐서
		//      로그인 입력값 검증대로 수행하도록 하는 코드를 작성해주세요.
		
		
		Map<String, String> loginInfo = new HashMap<>();
		loginInfo.put("id1", "password1");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("아이디를 입력하세요.");
			String id = scanner.nextLine();
			System.out.println("비밀번호를 입력하세요.");
			String pw = scanner.nextLine();
			
			if(loginInfo.containsKey(id)) {
				if(loginInfo.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
				} 
			} else {
				System.out.println("아이디가 존재하지 않습니다.");
			}

	}

}
}
