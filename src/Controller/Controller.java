package Controller;

import java.util.Scanner;

import Model.FireBet;
import Model.Marine;

public class Controller {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Marine m1 = new Marine(200,10,"m1");
		Marine m2 = new Marine(100,20,"m2");
		FireBet f1 = new FireBet(100,10,"f1");

	
		m1.Attack(f1);
		f1.seeState();
		m1.Attack(f1);
		f1.seeState();
		
		
//		int i = 0;
//		while(i==0){
//			System.out.println("-------------------------------");
//			System.out.println("1.공격 2. UPGRADE 3.상태보기 (종료하려면 아무키나)");
//			System.out.println("-------------------------------");
//			int num = scanner.nextInt();
//			switch(num){
//			case 1 :
//				m1.Attack(m2);
//				break;
//			case 2 :
//				m1.Upgrade();
//				break;
//			case 3 :
//				m1.seeState();
//				break;
//
//			default :
//				i=1;
//				break;
//			}
//		}
//		
	}

}
