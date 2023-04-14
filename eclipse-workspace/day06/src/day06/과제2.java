package day06;

public class 과제2 {
	public static void main(String[] args) {
		
	// 점메추, 저메추 해주는 코드를 짜주세요.
	//	난수를 발생시켜서 점심이나 저녁메뉴를 콘솔에 하나 띄우면 됩니다.
		
		String[] lunchMenu = {"라면", "샐러드", "초밥", "카레", "샌드위치","짜장면", "김밥"};
		String[] dinnerMenu = {"삼겹살", "치킨", "곱창", "피자", "마라탕", "양꼬치"};
	
		Random random = new Random();
		
		int lunchtype =  random.nextInt(lunchMenu);
		int dinnertype = random.nextInt(dinnerMenu);
		
		System.out.println("점심메뉴추천: " + lunchMenu);
		System.out.println("저녁메뉴추천: " + dinnerMenu);
		
		}
	}


