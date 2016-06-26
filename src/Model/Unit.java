package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead=false;
	private Coordinate coordinate;//��ǥ�� unit�� �Ӽ����� ����
	
	
	public Unit(int hp, int hit, String name){//������
		this.hp=hp;
		this.hit=hit;
		this.name = name;
		coordinate = new Coordinate(0, 0);
	}
	
	
	public void right() {		
		System.out.println(this.name+"�� ��ǥ");
		coordinate.Right();
		}
	
	public void down() {		
		System.out.println(this.name+"�� ��ǥ");
		coordinate.Down();
		}
	
	public void seeState(){//���� �����ֱ�
		System.out.println(name+"�� HP:"+hp+", HIT:"+hit+", "
				+ "��ǥ :("+coordinate.getX()+","+coordinate.getY()+")");
		

	}
	public void Attack(Unit unit){//����
		if(coordinate.getDistance(unit.coordinate)<=5){
			
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
		
		}else{
			System.out.println("�Ÿ��� �־� ������ �� �����ϴ�.");
		}
	}
	
	public void Upgrade(){//���׷��̵�!
		System.out.println("\nUPGRADE!");
		this.hit=this.hit+10;
		System.out.println(this.name+"�� ���ݷ��� "+this.hit+" �Ǿ����ϴ�.");
	}
}
