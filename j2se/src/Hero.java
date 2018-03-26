
public class Hero {
	String name;
	float hp;
	float armor;
	int moveSpeed;
	int killed;
	int kill;
	int support;
	int money;
	int lastHit;
	int attackSpeed;
	String wordAfterKill;
	String wordAfterKilled;
	
	//坑队友
	void keng() {
		System.out.println("坑队友！");
	}
	
	//获得护甲值
	float getArmor() {
		return armor;
	}
	
	//增加移动速度
	void addSpeed(int speed) {
		moveSpeed = moveSpeed + speed;
	}
	
	float getSpeed() {
		
		System.out.println(moveSpeed);
		return 2;
	}
	
	void legendary() {
		System.out.println("超神了");
	}
	
	float getHp() {
		System.out.println(hp);
		return hp;
	}
	
	void recovery(float blood) {
		hp = hp + blood;
		
	}
	

	public static void main(String[] args) {
		Hero garen = new Hero();
		garen.name = "盖伦";
		garen.hp = 313.45f;
		garen.armor = 616.28f;
		garen.moveSpeed = 300;
		garen.addSpeed(100);
		garen.getSpeed();
		garen.recovery(100);
		garen.getHp();
		
		
		Hero teemo = new Hero();
		teemo.name = "提莫";
		teemo.hp = 123.12f;
		teemo.armor = 12.2f;
		teemo.moveSpeed = 999;
		
	}
}
