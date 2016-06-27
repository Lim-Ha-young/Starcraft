package Model;

public class Marine extends Unit {// Unit한테 상속되어서 Unit의 속성을 쓸 수 있음.

	public Marine(int hp, int hit, String name) {
		super(hp, hit, name);
		this.hp = hp;
		this.hit = hit;
		this.name = name;
	}

	// 부모의 가지고 있는 속성을 다시 쓰는게 "재정의"
	// 옆에 세모가 있으면 "재정의"
	/*
	 * public void seeState(){//상태 보여주기 System.out.println("마린 : "+name+"의 HP가"
	 * +hp+", HIT이 "+hit+"입니다."); }
	 */

}