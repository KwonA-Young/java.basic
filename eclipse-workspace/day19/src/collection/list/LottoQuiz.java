package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class LottoQuiz {
	public static void main(String[] args) {
		/*
		 * Lotto: 1~45 숫자중 6개 뽑아 추첨
		 * 
		 * 1. List<Integer> 타입 변수에 구현체를 대입하고
		 *    해당 변수에 중복 없이 6개의 번호가 들어가게 해주세요.
		 *    
		 * 2. 당첨될 때까지 번호를 계속 뽑는 코드를 작성해서 
		 *    몇 번먼에 로또가 당첨되는지 확인하는 시뮬레이션 코드를 만들어주세요.
		 *    
		 * <Hint> 
		 * equals()로 배열끼리 비교할 때는 배열 내부 요소의 순서와 자료 모두를 비교한다.
		 *  ex) [1, 2, 3]과 [1, 2, 3]은 true로 비교되지만
		 * 		[1, 2, 3]과 [1, 3, 2]는 false로 비교된다.
		 */
		
		// 로또복권 번호를 적재할 컬렉션 생성
		// 제네릭에는 int 대신 Integer로 넣어야 함 

	
		 List<Integer> lottoWinNumbers = new ArrayList<>();
		 
		 	// Random 클래스 생성해서 난수발생
	        Random rn = new Random();
	     
	        
	        // 번호 6개가 중복 없이 당첨되려면 몇 바퀴를 돌려야 하는지 모르므로 while 문 
	        while (lottoWinNumbers.size() < 6) {
	        	// 1~45 범위로 난수 발생해 변수에 저장 
	        	Integer thisTimeGetNumber = rn.nextInt(1, 46);
	           // 기존에 이미 뽑았던 숫자인지 확인 한 후 
	            if (!lottoWinNumbers.contains(thisTimeGetNumber)) {
	            	// 없는 번호면 적재 
	                lottoWinNumbers.add(thisTimeGetNumber);
	            }
	        }
	        
	        // 번호 정렬
	        Collections.sort(lottoWinNumbers);
	        // 당첨번호체크
	        System.out.println(lottoWinNumbers);
	}

}
