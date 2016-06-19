package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead=false;
	
	public Unit(int hp, int hit, String name){
		this.hp=hp;
		this.hit=hit;
		this.name = name;
	}
	public void seeState(){
		System.out.println(name+"의 HP:"+hp);
		System.out.println("     HIT:"+hit+"\n");

	}
	public void Attack(Unit unit){
		if(unit.hp<=0){
			this.isDead=true;
			System.out.println("죽음");
		}
		else{
		System.out.println("unit ATTACK!");
		unit.hp=unit.hp-this.hit;
		
		
		System.out.println(this.name+"이 "+unit.name +"을 공격한당\n");
		}
		if(unit.hp<=0){
			System.out.println("더이상 공격 ㄴㄴ");
		}
		
	}
	
	public void Upgrade(){
		this.hit=this.hit+10;
		System.out.println(this.name+"의 공격력이 "+this.hit+" 되었습니다.\n");
	}
}
