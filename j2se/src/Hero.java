
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
	
	//�Ӷ���
	void keng() {
		System.out.println("�Ӷ��ѣ�");
	}
	
	//��û���ֵ
	float getArmor() {
		return armor;
	}
	
	//�����ƶ��ٶ�
	void addSpeed(int speed) {
		moveSpeed = moveSpeed + speed;
	}
	
	float getSpeed() {
		
		System.out.println(moveSpeed);
		return 2;
	}
	
	void legendary() {
		System.out.println("������");
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
		garen.name = "����";
		garen.hp = 313.45f;
		garen.armor = 616.28f;
		garen.moveSpeed = 300;
		garen.addSpeed(100);
		garen.getSpeed();
		garen.recovery(100);
		garen.getHp();
		
		
		Hero teemo = new Hero();
		teemo.name = "��Ī";
		teemo.hp = 123.12f;
		teemo.armor = 12.2f;
		teemo.moveSpeed = 999;
		
	}
}
