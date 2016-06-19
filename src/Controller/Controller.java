package Controller;

import java.util.Scanner;

import Model.FireBet;
import Model.Marine;

public class Controller {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine("m1",1000,100);
		Marine m2 = new Marine("m2",1000,50);
		FireBet f = new FireBet("f1",200,10);
		
		int i = 0;
		while(i==0){
			System.out.println("-------------------------------");
			System.out.println("1.공격 2. UPGRADE 3.상태보기 (종료하려면 아무키나)");
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
				m1.seeHP();
				break;

			default :
				i=1;
				break;
			}
		}
		
		m1.getHp();
		
		
		m2.Attack(m1);
		m1.Attack(f);
		f.seeHP();
		m1.Attack(f);
		m1.Attack(f);
	}

}
