package Model;

import listener.OnDiedListener;

public abstract class Unit {// class�� abstract�� �Ǿ���Ѵ�.

	protected int hp;
	protected int hit;
	protected String name;
	public boolean isDead = false;
	private Coordinate coordinate;// ��ǥ�� unit�� �Ӽ����� ����

	private OnDiedListener onDiedListener;

	public OnDiedListener getOnDiedListener() {
		return onDiedListener;
	}

	public void setOnDiedListener(OnDiedListener onDiedListener) {
		this.onDiedListener = onDiedListener;
	}

	public Unit(int hp, int hit, String name) {// ������
		this.hp = hp;
		this.hit = hit;
		this.name = name;
		coordinate = new Coordinate(0, 0);
	}

	// bark�� ���� ��Ȯ�� ������ �����ϰڴ�.
	public abstract void bark();

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void right() {
		System.out.println(this.name + "�� ��ǥ");
		coordinate.goRight();
	}

	public void down() {
		System.out.println(this.name + "�� ��ǥ");
		coordinate.goDown();
	}

	public void seeState() {// ���� �����ֱ�
		if (hp >= 0) {
			System.out.println(name + "�� HP:" + hp + ", HIT:" + hit + ", " + "��ǥ :(" + coordinate.getX() + ","
					+ coordinate.getY() + ")");
		} else {
			System.out.println(name + "�� �׾����ϴ�.");
		}
	}

	// ���� �������� �Ǻ����ִ� �Լ�
	public boolean isAttackable(Unit unit) {

		if (coordinate.getDistance(unit.coordinate) <= 5) {
			return true;
		} else {
			System.out.println("���� ������ �Ÿ��� �ƴմϴ�.");
			return false;
		}
	}

	public void Attack(Unit unit) {// ����
		// if(isAttackable(unit)){

		if (unit.hp <= 0) {
			this.isDead = true;
			System.out.println(unit.name + "�� �׾����ϴ�.");
		} else {

			System.out.println("\nunit ATTACK!");
			unit.hp = unit.hp - this.hit;
			if (unit.hp <= 0) {

				OnDiedListener targetOnDiedListener = unit.getOnDiedListener();
				if (targetOnDiedListener != null) {
					targetOnDiedListener.onDied();
				}

				System.out.println("���̻� ������ �� �����ϴ�.");
			}

			System.out.println(this.name + "�� " + unit.name + "�� �����߽��ϴ�.");
		}

	}


	public void Upgrade() {// ���׷��̵�!
		System.out.println("\nUPGRADE!");
		this.hit = this.hit + 10;
		System.out.println(this.name + "�� ���ݷ��� " + this.hit + " �Ǿ����ϴ�.");
	}
}
