package Model;

public class FireBet {
	
	public String name;
	public int hp;
	public int hit;
	
	
	public FireBet(String name, int hp, int hit){
		
		System.out.println("파이어벳이 생성되었습니당.");
		this.name=name;
		this.hp=hp;
		this.hit=hit;
		
	}
	
public void Attack(Marine a){
		
		int hp = a.getHp();
		
		if(hp <= 0){
			System.out.println("더이상 공격할 수 없습니다.");
		}
		else{
			System.out.println(this.name+"이(가)"
						+a.name+"를 공격했습니다.\n");
			hp = hp - this.hit;
			if(a.getHp() <= 0){
				System.out.println(a.name+"이(가) 죽었습니다.");
				a.name=null;
			}
	}
		
}

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
//public void seeHP(){
//	System.out.println(this.name+"의 HP가 "+this.hp+" 되었습니다.\n");
//}

}
