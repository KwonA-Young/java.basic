package day04;

public class ForExample1 {
	public static void main(String[] args) {
		int sum = 0;
			//   초기값  조건식 중간값
		for(int i =0; i <5; i++) {
			sum += i; // sum에 0, 1, 2, 3, 4를 순차적으로 누적해 더함
		}
		
		System.out.println("0~4까지의 누적합 : " + sum);
		
		int sum = 0;
		for (int i = 1;, i <=100, i ++) {
			sum = sum + i;
		
		}
		System.out.println("1~100의 합" +sum);
	}
}
