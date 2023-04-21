package collection.map;

import java.util.ArrayList;
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
		

	
		 List<Integer> lottoNumbers = new ArrayList<>();
	        Random random = new Random();
	     
	        while (lottoNumbers.size() < 6) {
	            int num = random.nextInt(45) + 1; // 1~45 범위
	            if (!lottoNumbers.contains(num)) {
	                lottoNumbers.add(num);
	            }
	        }

	        System.out.println("Lotto numbers: " + lottoNumbers);
		
		
		
		
		
	}

}
