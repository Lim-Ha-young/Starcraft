package Controller;



import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import Model.FireBet;
import Model.Marine;
import Model.Unit;

public class Controller {
	public static void main(String[] args) {
		
		
		//List<Marine> list= new ArrayList<Marine>();//������ ���� �����̳� ����(�迭)-Ž������
	//	List<Marine> list2 = new LinkedList<Marine>();//��ũ�� ����Ʈ-��������
		////���׸�//////����ư�� ������ ��������
		///���׸��� �Ⱦ���, � Ÿ���̵� �� �ְڴ�!But, ������ִ°� ����!
		List<Unit> list= new ArrayList<Unit>();
		Scanner scanner = new Scanner(System.in);
	
		
		Marine m1 = new Marine(200,10,"m1");
		//Marine m2 = new Marine(100,20,"m2");
		FireBet f1 = new FireBet(200,10,"f1");
		//FireBet f2 = new FireBet(100,10,"f2");

	
		m1.Attack(f1);
		f1.seeState();
		m1.Upgrade();
		m1.Attack(f1);
		f1.seeState();
		m1.Attack(f1);
		m1.Attack(f1);
		m1.Attack(f1);
		m1.Attack(f1);
		
		m1.right();
		m1.right();
		f1.down();
		m1.right();
		m1.right();
		m1.right();
		m1.right();
		m1.right();
		m1.right();
		m1.Attack(f1);
		
		
		
	
	/*	int i = 0;
		while(i==0){
			System.out.println("--------------------------------");
			System.out.println("1.�������� 2.���̾����� 3.��Ȳ 4.��ġ���� ");
			System.out.println("(�Ѹ����� ���� �ϼ���.)");
			System.out.println("(�����Ϸ��� �ƹ�Ű�� ��������.)");
			
			int num = scanner.nextInt();
			switch(num){
			case 1 :
			
				System.out.println("������ ������ HP�� �Է��ϼ��� : ");
				int mHp= scanner.nextInt();
				System.out.println("������ ������ HIT�� �Է��ϼ��� : ");
				int mHit = scanner.nextInt();
				System.out.println("������ �����Ǿ����ϴ�.\n");
				Marine m = new Marine(mHp,mHit,"marine");
				
				list.add(m);						
				break;
				
			case 2 :
				
				System.out.println("������ ���̾���� HP�� �Է��ϼ��� : ");
				int fHp= scanner.nextInt();
				System.out.println("������ ���̾���� HIT�� �Է��ϼ��� : ");
				int fHit = scanner.nextInt();
				System.out.println("���̾���� �����Ǿ����ϴ�.\n");
				FireBet f = new FireBet(fHp,fHit,"firebet");
				
				list.add(f);						
				break;
				
			case 3 :
			System.out.println(list.size()+"����");
			
			for (int j = 0; j < list.size(); j++) {
				Unit unit=list.get(j);
				unit.seeState();
				
			}
			
			
			
				break;
			case 4 :
				System.out.println("�̵��� Unit�� �����ϼ���");
				//���� ������ �����Ѵ�.
				//��ǥ��� ������ �ִ´�.(0,0)~(100,100)
				//unit�� (0,0)���� �����ǰ� ��� ��ġ�� �̵��� �� �ִ�.
				//���ݰŸ����� ��갡��.
				
				
				
				
				break;

			default :
				i=1;
				break;
			}
		}*/
		
	}

}
