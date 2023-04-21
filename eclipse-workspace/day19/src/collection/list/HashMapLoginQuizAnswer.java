package collection.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapLoginQuizAnswer {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Map<String, String> idPw = new HashMap<>();
		
		System.out.println("=============");
		System.out.println("아이디와 비밀번호 입력");
		System.out.println();
		
		
		
		
		System.out.println("ID: ");
		String id = sc.next();
		
		
		
		if(idPw.containsKey(id))  {
			System.out.println("PW: ");
			String pw = sc.next();
			String check = idPw.get(id);
			if (check.equals(pw)) {
				System.out.println("로그인 성공");
			} else {
				System.out.println("PW 입력 오류");
			}
		} else {
			System.out.println("ID 입력 오류");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
