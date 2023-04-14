package noinherit;

public class Pig {
	// 필드 : hp, atk, def
		private int hp;
		private int atk;
		private int def;
		
		// 생성자에서 void 파라미터로 각각 3, 0, 0 으로 초기화
		public Pig() {
			this.hp = 10;
			this.atk = 2;
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
		
		// 해당 몬스터 사망 여부를 boolean으로 체크해주는 getter
		public boolean isPigtActive() {
			return hp > 0 ?  true : false;
		}
				
		// 공격 받은 뒤에 살아있는지 죽었는지 체크
		public boolean isAttackedPigActive(int userAtk) {
			return (hp - userAtk) > 0 ? true : false;
		}
		
		public void setDamagedHp(int userAtk) {
			this.hp = this.hp - (userAtk - this.def);
		}

	}



