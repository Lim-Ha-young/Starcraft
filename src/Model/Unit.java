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
		System.out.println(name+"�� HP:"+hp);
		System.out.println("     HIT:"+hit+"\n");

	}
	public void Attack(Unit unit){
		if(unit.hp<=0){
			this.isDead=true;
			System.out.println("����");
		}
		else{
		System.out.println("unit ATTACK!");
		unit.hp=unit.hp-this.hit;
		
		
		System.out.println(this.name+"�� "+unit.name +"�� �����Ѵ�\n");
		}
		if(unit.hp<=0){
			System.out.println("���̻� ���� ����");
		}
		
	}
	
	public void Upgrade(){
		this.hit=this.hit+10;
		System.out.println(this.name+"�� ���ݷ��� "+this.hit+" �Ǿ����ϴ�.\n");
	}
}
