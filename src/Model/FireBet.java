package Model;

public class FireBet {
	
	public String name;
	public int hp;
	public int hit;
	
	
	public FireBet(String name, int hp, int hit){
		
		System.out.println("���̾�� �����Ǿ����ϴ�.");
		this.name=name;
		this.hp=hp;
		this.hit=hit;
		
	}
	
public void Attack(Marine a){
		
		int hp = a.getHp();
		
		if(hp <= 0){
			System.out.println("���̻� ������ �� �����ϴ�.");
		}
		else{
			System.out.println(this.name+"��(��)"
						+a.name+"�� �����߽��ϴ�.\n");
			hp = hp - this.hit;
			if(a.getHp() <= 0){
				System.out.println(a.name+"��(��) �׾����ϴ�.");
				a.name=null;
			}
	}
		
}

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
//public void seeHP(){
//	System.out.println(this.name+"�� HP�� "+this.hp+" �Ǿ����ϴ�.\n");
//}

}
