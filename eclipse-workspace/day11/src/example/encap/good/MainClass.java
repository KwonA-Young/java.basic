package example.encap.good;

public class MainClass {
	
	public static void main(String[] args) {
		MyBirthday mb = new MyBirthday(1998, 12, 17);
		
		// 접근제한자 private이므로 직접 수정 불가
		
		//mb.day = 99;
		//mb.month = 16;
		//mb.year = 2025;
		
		mb.showDateInfo() ;
	}

}