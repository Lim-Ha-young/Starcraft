package Controller;

import java.util.Scanner;

import Model.FireBet;
import Model.Marine;

public class Controller {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
	
		
		Marine m1 = new Marine(200,20,"m1");
		//Marine m2 = new Marine(100,20,"m2");
		FireBet f1 = new FireBet(100,10,"f1");
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
		
		
		
		int i = 0;
		while(i==0){
			System.out.println("--------------------------------");
			System.out.println("1.�������� 2.���̾�� ���� 3.�����ϱ� ");
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
				Marine m2 = new Marine(mHp,mHit,"m2");
				m1.seeState();
				
							
				break;
			case 2 :
				System.out.println("������ ���̾���� HP�� �Է��ϼ��� : ");
				int fHp= scanner.nextInt();
				System.out.println("������ ���̾���� HIT�� �Է��ϼ��� : ");
				int fHit = scanner.nextInt();
				System.out.println("���̾���� �����Ǿ����ϴ�.\n");
				FireBet f2 = new FireBet(fHp,fHit,"f2");
				f1.seeState();
				break;
			case 3 :
				System.out.println("������ ���̾���� �����մϴ�.");
				/*
				 * ���� ��� �ϴ��� �𸣰���.
				m1.Attack(f1);*/
				break;

			default :
				i=1;
				break;
			}
		}
		
	}

}
