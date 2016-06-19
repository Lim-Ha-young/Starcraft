package Model;

public class Marine extends Unit {
	
	private int hp;//캡슐화를 위한 private선언
	public int hit;	
	public boolean isDead=false;
	
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

	//캡슐화//getter, setter
	public int getHp(){
		return this.hp;
	}
	
	public void setHP(int hp){
		this.hp=hp;
		if(hp<=0){
			this.isDead=true;
			System.out.println("죽음");
		}
	}
	////////////////////////////////////////
	public Marine(int hit,String name){
		super(100,hit, name);
		this.hit=hit;
		this.name=name;
	}
	
//	public Marine(String name, int hp, int hit){
//		
//		System.out.println("마린이 생성되었습니당.");
//		this.name=name;
//		this.hp=hp;
//		this.hit=hit;
//		
//	}
	
	public void Attack(Marine a){
		
		if(a.hp <= 0){
			System.out.println("더이상 공격할 수 없습니다.");
		}
		else{
			System.out.println(this.name+"이(가)"
						+a.name+"를 공격했습니다.\n");
			a.hp=a.hp-this.hit;
			if(a.hp <= 0){
				System.out.println(a.name+"이(가) 죽었습니다.");
				a.name=null;
			}
	}
		
}
	//파라미터만 다르게!!!!!
public void Attack(FireBet a){
		
		if(a.hp <= 0){
			System.out.println("더이상 공격할 수 없습니다.");
		}
		else{
			System.out.println(this.name+"이(가)"
						+a.name+"를 공격했습니다.\n");
			a.hp=a.hp-this.hit;
			if(a.hp <= 0){
				System.out.println(a.name+"이(가) 죽었습니다.");
				a.name=null;
			}
	}
		
}
//	public void seeHP(){
//		System.out.println(this.name+"의 HP가 "+this.hp+" 되었습니다.\n");
//	}
	public void Upgrade(){
		this.hit=this.hit+100;
		System.out.println(this.name+"의 공격력이 "+this.hit+" 되었습니다.\n");
	}

}