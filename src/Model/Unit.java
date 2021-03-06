package Model;

import listener.OnDiedListener;

public abstract class Unit {// class도 abstract가 되어야한다.

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead = false;
	private Coordinate coordinate;// 좌표를 unit의 속성으로 넣음

	private OnDiedListener onDiedListener;

	public OnDiedListener getOnDiedListener() {
		return onDiedListener;
	}

	public void setOnDiedListener(OnDiedListener onDiedListener) {
		this.onDiedListener = onDiedListener;
	}

	public Unit(int hp, int hit, String name) {// 생성자
		this.hp = hp;
		this.hit = hit;
		this.name = name;
		coordinate = new Coordinate(0, 0);
	}

	// bark에 대한 정확한 구현은 포기하겠다.
	public abstract void bark();

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void right() {
		System.out.println(this.name + "의 좌표");
		coordinate.goRight();
	}

	public void down() {
		System.out.println(this.name + "의 좌표");
		coordinate.goDown();
	}

	public void seeState() {// 상태 보여주기
		if (hp >= 0) {
			System.out.println(name + "의 HP:" + hp + ", HIT:" + hit + ", " + "좌표 :(" + coordinate.getX() + ","
					+ coordinate.getY() + ")");
		} else {
			System.out.println(name + "이 죽었습니다.");
		}
	}
	
	// 공격 가능한지 판별해주는 함수
	public boolean isAttackable(Unit unit) {

		if (coordinate.getDistance(unit.coordinate) <= 5) {
			return true;
		} else {
			System.out.println("공격 가능한 거리가 아닙니다.");
			return false;
		}
	}

	public void Attack(Unit unit) {// 공격
		// if(isAttackable(unit)){

		if (unit.hp <= 0) {
			this.isDead = true;
			System.out.println(unit.name + "이 죽었습니다.");
		} else {

			System.out.println("\nunit ATTACK!");
			unit.hp = unit.hp - this.hit;
			if (unit.hp <= 0) {

				OnDiedListener targetOnDiedListener = unit.getOnDiedListener();
				if (targetOnDiedListener != null) {
					targetOnDiedListener.onDied();
				}

				System.out.println("더이상 공격할 수 없습니다.");
			}

			System.out.println(this.name + "이 " + unit.name + "을 공격했습니다.");
		}

	}


	public void Upgrade() {// 업그레이드!
		System.out.println("\nUPGRADE!");
		this.hit = this.hit + 10;
		System.out.println(this.name + "의 공격력이 " + this.hit + " 되었습니다.");
	}
}
