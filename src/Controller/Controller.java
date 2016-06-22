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
			System.out.println("1.마린생성 2.파이어뱃 생성 3.공격하기 ");
			System.out.println("(한마리만 생성 하세요.)");
			System.out.println("(종료하려면 아무키나 누르세요.)");
			int num = scanner.nextInt();
			switch(num){
			case 1 :
			
				System.out.println("생성할 마린의 HP를 입력하세요 : ");
				int mHp= scanner.nextInt();
				System.out.println("생성할 마린의 HIT을 입력하세요 : ");
				int mHit = scanner.nextInt();
				System.out.println("마린이 생성되었습니다.\n");
				Marine m2 = new Marine(mHp,mHit,"m2");
				m1.seeState();
				
							
				break;
			case 2 :
				System.out.println("생성할 파이어뱃의 HP를 입력하세요 : ");
				int fHp= scanner.nextInt();
				System.out.println("생성할 파이어뱃의 HIT을 입력하세요 : ");
				int fHit = scanner.nextInt();
				System.out.println("파이어뱃이 생성되었습니다.\n");
				FireBet f2 = new FireBet(fHp,fHit,"f2");
				f1.seeState();
				break;
			case 3 :
				System.out.println("마린이 파이어뱃을 공격합니다.");
				/*
				 * 공격 어떻게 하는지 모르겠음.
				m1.Attack(f1);*/
				break;

			default :
				i=1;
				break;
			}
		}
		
	}

}
