package poly.inherit;

public class Magician {
	 
	private int atk;
	private int hp;
	private int def;
	
	public Magician() {
		this.atk = 2;
		this.hp = 20;
		this.def = 0;
	}
	public void showStatus() {
		System.out.println("체력 : " + this.hp);
		System.out.println("공격력 : " + this.atk);
		System.out.println("방어력 : " + this.def);
	}
	
	public void hunt(Monster monster) {
		// 죽은 몬스터는 교전 불가 및 종료
		if (monster.isInactive()) {
			showMonsterAlreadyDedMessage(monster.getName());
			return;
		}
		
		// 몬스터가 다음 공격에 죽으면 플레이어에게 경험치 부여
		if (monster.isInactiveAfterNextAttacked(this.atk)) {
			callUserAttackMonsterActive(monster);
			
		} else {
		// 몬스터가 다음 공격에 죽지는 않으면 반격해 플레이어 체력 차감 
			monster.setAfterAttackedHp(this.atk);
			setHpAfterMonsterAttack(monster.getAtk());
			showMonsterCounterAttackMessage(monster.getName());
		}
	}
	public void castFrieball(Magician magician) {
		int damage = this.getAtk() * 2;
		this.hp -= damage;
		System.out.println("공격당했습니다.");
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

		
	// 그냥 Warrior 내부에서 적어도 되지만 
	// 코드 흐름을 메서드 호출로만 제어하기 위해서 분리.
	
	// 상단 Warrior 체력을 차감하는 로직을 메서드로 분리 및 재정의 
	public void setHpAfterMonsterAttack (int monsterAtk) {
		if((monsterAtk > 0) && (monsterAtk - this.def) < 1) {
			this.hp -= 1;
		} else if (monsterAtk == 0) {
		}
		this.hp = this.hp - (monsterAtk - this.def);
	}
	
	public void setHpAfterAttackedHp(int monsterHp) {
		this.hp = this.hp - (monsterHp - this.def);
	}
	
	
	
	public void showMonsterAlreadyDedMessage(String monsterName) {
		System.out.println("이" + monsterName + "은(는) 이미 죽어서 교전할 수 없습니다.");
	}
	
	public void showWmonsterNowDeadMessage (String monsterName) {
		System.out.println(monsterName + "를(을) 죽였습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		
		System.out.println(monsterName + "이(가) 반격했습니다.");
	}
	
	// 플레이어의 공격을 받은 몬스터가 살아있을 때 실행하는 3줄의 로직을 1줄로 묶
	public void callUserAttackMonsterActive(Monster monster) {
		monster.setAfterAttackedHp(this.atk);
		gainMonsterExp(monster.getExp());
		showWmonsterNowDeadMessage(monster.getName());
	}
	
	private void gainMonsterExp(int hp) {
	}
	
	public void castFireball() {
		System.out.println(hp + "만큼 피해입었습니다." );

	}
	
	
		
	}
	

	
	
	
	

