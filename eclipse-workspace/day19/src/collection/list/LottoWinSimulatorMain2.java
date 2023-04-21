package collection.list;

import java.util.List;

public class LottoWinSimulatorMain2 {
	
	public static void main(String[] args) {
		// 로또 시뮬레이터 클래스의 기능을 실행만 한다.
		LottoWinSimulatorGoodCase2 ls = new LottoWinSimulatorGoodCase2();
		
		// 11 ~ 14 번 라인을 보고싶지 않다면, LSG2 의 멤버변수로 해당자료를 선언해도 됩니다. 
		List<Integer> powerWinNumbers = ls.getPowerNumbers();
		Integer powerWinNumber = ls.getPowerNumber();
		List<Integer> powerGetNumbers = ls.getPowerNumbers();
		Integer powerGetNumber = ls.getPowerNumber();
		ls.tryWinLoop(powerWinNumbers, powerGetNumbers, powerWinNumber, powerGetNumber);

		System.out.println("반복 횟수 : " + ls.getCount());
		
	
	}

}
