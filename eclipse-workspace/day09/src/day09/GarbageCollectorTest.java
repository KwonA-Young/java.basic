package day09;

public class GarbageCollectorTest {
	public int objectNum; // 객체번호 
	
	public GarbageCollectorTest(int number) {
		objectNum = number;
		System.out.println(objectNum + "번 객체 생성");
	}
	
	// 소멸자 (객체가 힙에서 삭제되기 직전에 실행되는 메서드)
	
	protected void finalize() throws Throwable {
		System.out.println(objectNum + "번 객체가 힙에서 삭제됩니다.");
	}
	
}
