package Model;

public class FireBet extends Unit {//Unit한테 상속되어서 Unit의 속성을 쓸 수 있음.

	public FireBet(int hp,int hit,String name){
		super(hp, hit, name);
		this.hp=hp;
		this.hit=hit;
		this.name=name;
	}
	
}
