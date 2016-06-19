package Model;

public class Marine {
	
	public String name;
	private int hp;//ĸ��ȭ�� ���� private����
	public int hit;	
	public boolean isDead=false;
	
	// alt + shift + S + R : ��� �Ӽ� setter, getter ����
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHit() {
		return hit;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public boolean isDead() {
		return isDead;
	}

	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	//ĸ��ȭ//getter, setter
	public int getHp(){
		return this.hp;
	}
	
	public void setHP(int hp){
		this.hp=hp;
		if(hp<=0){
			this.isDead=true;
			System.out.println("����");
		}
	}
	////////////////////////////////////////
	
	
	public Marine(String name, int hp, int hit){
		
		System.out.println("������ �����Ǿ����ϴ�.");
		this.name=name;
		this.hp=hp;
		this.hit=hit;
		
	}
	
	public void Attack(Marine a){
		
		if(a.hp <= 0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
		else{
			System.out.println(this.name+"��(��)"
						+a.name+"�� �����߽��ϴ�.\n");
			a.hp=a.hp-this.hit;
			if(a.hp <= 0){
				System.out.println(a.name+"��(��) �׾����ϴ�.");
				a.name=null;
			}
	}
		
}
	//�Ķ���͸� �ٸ���!!!!!
public void Attack(FireBet a){
		
		if(a.hp <= 0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
		else{
			System.out.println(this.name+"��(��)"
						+a.name+"�� �����߽��ϴ�.\n");
			a.hp=a.hp-this.hit;
			if(a.hp <= 0){
				System.out.println(a.name+"��(��) �׾����ϴ�.");
				a.name=null;
			}
	}
		
}
	public void seeHP(){
		System.out.println(this.name+"�� HP�� "+this.hp+" �Ǿ����ϴ�.\n");
	}
	public void Upgrade(){
		this.hit=this.hit+100;
		System.out.println(this.name+"�� ���ݷ��� "+this.hit+" �Ǿ����ϴ�.\n");
	}

}