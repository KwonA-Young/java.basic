package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

// 기능 분리 없이 구현에만 초점을 맞춘 케이스
public class LottoWinSimulatorBadCase {
	
	public static void main(String[] args) {
		
		// 비교를 하기 위해서
		// 1. 당첨 번호 6개를 먼저 뽑고
		// 로또복권 번호를 적재할 컬렉션 생성
		// 제네릭에는 int 대신 Integer로 넣어야 함
		List<Integer> lottoWinNumbers = new ArrayList<>();
		
		// Random 클래스 생성행서 난수 발생
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
        
        // 2. 추첨번호 6개 추가로 뽑아서 같은 게 나올 때까지 비교 -> 추첨 을 반복
			 List<Integer> lottoTryNumbers = new ArrayList<>();
			
			 // 반복횟수 측적용 변수
			 int count = 0;
			 
			 // 추첨번호와 당첨번호를 비교해서 다르면 반복문 실행, 같으면 종료 
		        while(!lottoTryNumbers.equals(lottoWinNumbers)) {
		        	count++;
		        	
		        // 번호가 찬 채로 반복문이 진행되므로, 다시 비워야 함.
		        lottoTryNumbers.clear();
		        while (lottoTryNumbers.size() < 6) {
		        	// 1~45 범위로 난수 발생해 변수에 저장 
		        	Integer thisTimeGetNumber = rn.nextInt(1, 46);
		        System.out.println(thisTimeGetNumber);
		           // 기존에 이미 뽑았던 숫자인지 확인 한 후 
		        
		            if (!lottoTryNumbers.contains(thisTimeGetNumber)) {
		            	
		            	// 없는 번호면 적재 
		                lottoTryNumbers.add(thisTimeGetNumber);
		            }
		
		        }
		        // 번호 정렬
		        Collections.sort(lottoTryNumbers);
		        System.out.println(lottoTryNumbers);
		        System.out.println(lottoWinNumbers);
		        System.out.println("====================");
		        }
		        System.err.println("당신은 " + count + "장의 로또를 사고 당첨되었습니다.");
		        }	        
}
