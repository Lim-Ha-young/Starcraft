package Model;

public class Marine extends Unit {// Unit���� ��ӵǾ Unit�� �Ӽ��� �� �� ����.

	public Marine(int hp, int hit, String name) {
		super(hp, hit, name);
		this.hp = hp;
		this.hit = hit;
		this.name = name;
	}
	
	public void bark(){
		System.out.println( "marine!!");
	}

	// �θ��� ������ �ִ� �Ӽ��� �ٽ� ���°� "������"
	// ���� ���� ������ "������"
	/*
	 * public void seeState(){//���� �����ֱ� System.out.println("���� : "+name+"�� HP��"
	 * +hp+", HIT�� "+hit+"�Դϴ�."); }
	 */

}