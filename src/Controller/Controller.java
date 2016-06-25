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
		
		
		//List<Marine> list= new ArrayList<Marine>();//마린을 담을 컨테이너 생성(배열)-탐색좋음
	//	List<Marine> list2 = new LinkedList<Marine>();//링크드 리스트-삽입좋음
		////제네릭//////리스튼데 마린을 담을꺼당
		///제네릭을 안쓰면, 어떤 타입이든 다 넣겠다!But, 명시해주는게 좋다!
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
			System.out.println("1.마린생성 2.파이어뱃생성 3.현황 4.위치변경 ");
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
				Marine m = new Marine(mHp,mHit,"marine");
				
				list.add(m);						
				break;
				
			case 2 :
				
				System.out.println("생성할 파이어뱃의 HP를 입력하세요 : ");
				int fHp= scanner.nextInt();
				System.out.println("생성할 파이어뱃의 HIT을 입력하세요 : ");
				int fHit = scanner.nextInt();
				System.out.println("파이어뱃이 생성되었습니다.\n");
				FireBet f = new FireBet(fHp,fHit,"firebet");
				
				list.add(f);						
				break;
				
			case 3 :
			System.out.println(list.size()+"마리");
			
			for (int j = 0; j < list.size(); j++) {
				Unit unit=list.get(j);
				unit.seeState();
				
			}
			
			
			
				break;
			case 4 :
				System.out.println("이동할 Unit을 선택하세요");
				//누가 누구를 공격한다.
				//좌표라는 개념을 넣는다.(0,0)~(100,100)
				//unit은 (0,0)에서 생성되고 어느 위치로 이동할 수 있다.
				//공격거리까지 계산가능.
				
				
				
				
				break;

			default :
				i=1;
				break;
			}
		}*/
		
	}

}
