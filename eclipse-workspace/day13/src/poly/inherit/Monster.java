package poly.inherit;

public class Monster {
	
	// 모든 몬스터 클래스의 부모로 설계
	private String name; // 온갖 타입을 다 받을 수 있는 다형성 특성상 몬스터 종류 식별용
	private int hp;
	private int atk;
	private int def;
	private int exp;
	
	
	// 부모쪽 생성자로 초기화할때 어떤 몬스터가 생성될지 사전에 알 수 없으므로
	// 고정값이 아닌 입력자료를 받아 처리해야 하기 때문.
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.exp = exp;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}


	public int getAtk() {
		return atk;
	}


	public void setAtk(int atk) {
		this.atk = atk;
	}


	public int getDef() {
		return def;
	}


	public void setDef(int def) {
		this.def = def;
	}


	public int getExp() {
		return exp;
	}


	public void setExp(int exp) {
		this.exp = exp;
	}
	
	// 몬스터 사망 여부 판단하기
	public boolean isInactive() {
		return this.hp > 0 ? false : true;
	}
	
	// 다음 공격에 몬스터가 죽는지 판단하기
		public boolean isInactiveAfterNextAttacked(int userAtk) {
			return this.hp - userAtk <= 0 ? true : false;
	}
	
	// setter는 거의 대부분의 경우 void 리턴자료
	public void setAfterAttackedHp(int userAtk) {
	this.hp = this.hp - (userAtk*2) - (this.atk);
	}
	
	

}
