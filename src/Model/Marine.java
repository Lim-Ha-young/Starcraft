package Model;

public class Marine extends Unit {//Unit한테 상속되어서 Unit의 속성을 쓸 수 있음.
	
	public Marine(int hp,int hit,String name){
		super(hp, hit, name);
		this.hp=hp;
		this.hit=hit;
		this.name=name;
	}


}