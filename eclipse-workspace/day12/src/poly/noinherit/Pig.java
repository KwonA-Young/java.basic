package poly.noinherit;

	// 필드 hp,atk,def
public class Pig {
	 private int hp;
	 private int atk;
	 private int def;
	    
	public Pig () {
		this.hp = 10;
		this.atk = 0;
		this.def = 0;
		
		

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
	// 공격받은 후에 죽었는지 살았는지 확인
	
	
	public boolean isAttackedRatActive(int atk) {
		return (hp - userAtk) > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp = this.hp - (userAtk - this.def);
	}
	
	public void setDamagedHp
}
