package Model;

public class Unit {

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead=false;
	private Coordinate coordinate;//좌표를 unit의 속성으로 넣음
	
	
	public Unit(int hp, int hit, String name){//생성자
		this.hp=hp;
		this.hit=hit;
		this.name = name;
		coordinate = new Coordinate(0, 0);
	}	
	
	
	public int getHp() {
		return hp;
	}


	public void setHp(int hp) {
		this.hp = hp;
	}



	public void right() {		
		System.out.println(this.name+"의 좌표");
		coordinate.Right();
		}
	
	public void down() {		
		System.out.println(this.name+"의 좌표");
		coordinate.Down();
		}
	
	
	public void seeState(){//상태 보여주기
		if(hp>=0){
		System.out.println(name+"의 HP:"+hp+", HIT:"+hit+", "
				+ "좌표 :("+coordinate.getX()+","+coordinate.getY()+")");
		}
		else{
			System.out.println(name+"이 죽었습니다.");
		}
	}
	
	//공격 가능한지 판별해주는 함수
	public boolean isAttackable(Unit unit){
		
		if(coordinate.getDistance(unit.coordinate)<=5){
			return true;
	}else
		System.out.println("공격 가능한 거리가 아닙니다.");
		return false;
	}
	
	
	public void Attack(Unit unit){//공격
		// if(isAttackable(unit)){

		if (unit.hp <= 0) {
			this.isDead = true;
			System.out.println(unit.name + "이 죽었습니다.");
		} else {
			if (unit.hp <= 0) {
				System.out.println("더이상 공격할 수 없습니다.");
			}
			System.out.println("\nunit ATTACK!");
			unit.hp = unit.hp - this.hit;

			System.out.println(this.name + "이 " + unit.name + "을 공격했습니다.");
		}

	}
	// else{

	// }
	
	
	public void Upgrade(){//업그레이드!
		System.out.println("\nUPGRADE!");
		this.hit=this.hit+10;
		System.out.println(this.name+"의 공격력이 "+this.hit+" 되었습니다.");
	}
}
