package Controller;

import java.util.Scanner;

import Model.FireBet;
import Model.Marine;

public class Controller {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine(10,"m1");
		Marine m2 = new Marine(20,"m2");
		FireBet f = new FireBet("f1",200,10);
		
		
		m1.seeState();
		m2.seeState();
		
		int i = 0;
		while(i==0){
			System.out.println("-------------------------------");
			System.out.println("1.���� 2. UPGRADE 3.���º��� (�����Ϸ��� �ƹ�Ű��)");
			System.out.println("-------------------------------");
			int num = scanner.nextInt();
			switch(num){
			case 1 :
				m1.Attack(m2);
				break;
			case 2 :
				m1.Upgrade();
				break;
			case 3 :
				m1.seeState();
				break;

			default :
				i=1;
				break;
			}
		}
		
		m1.getHp();
		
		
		m2.Attack(m1);
		m1.Attack(f);
	
		m1.Attack(f);
		m1.Attack(f);
	}

}
