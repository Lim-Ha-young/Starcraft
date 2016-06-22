package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead=false;
	
	public Unit(int hp, int hit, String name){//������
		this.hp=hp;
		this.hit=hit;
		this.name = name;
	}
	
	public void seeState(){//���� �����ֱ�
		System.out.println(name+"�� HP��"+hp+", HIT�� "+hit+"�� �Ǿ����ϴ�.");
		

	}
	public void Attack(Unit unit){//����
		if(unit.hp<=0){
			this.isDead=true;
			System.out.println(unit.name+"�� �׾����ϴ�.");
		}
		else{
			if(unit.hp<=0){
				System.out.println("���̻� ������ �� �����ϴ�.");
			}
		System.out.println("\nunit ATTACK!");
		unit.hp=unit.hp-this.hit;
		
		
		System.out.println(this.name+"�� "+unit.name +"�� �����߽��ϴ�.");
		}
		
		
	}
	
	public void Upgrade(){//���׷��̵�!
		System.out.println("\nUPGRADE!");
		this.hit=this.hit+10;
		System.out.println(this.name+"�� ���ݷ��� "+this.hit+" �Ǿ����ϴ�.");
	}
}
