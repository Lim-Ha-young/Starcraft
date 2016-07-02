package Controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.blog.naver.sens921119.MyModule;
import com.kyh0209.Module;

import Model.FireBet;
import Model.Marine;
import Model.Unit;
import listener.OnDiedListener;

public class Controller {
	public static void main(String[] args) {

		// 맨앞이 대문자가 아니면 "프리미티브"
		// 맨앞이 대문자면 "클래스"
		// call by reference
		// call by value
		// NULL:아무것도 없는 주소를 가지고있다.

		// List<Marine> list= new ArrayList<Marine>();//마린을 담을 컨테이너 생성(배열)-탐색좋음
		// List<Marine> list2 = new LinkedList<Marine>();//링크드 리스트-삽입좋음
		////// 제네릭//////리스튼데 마린을 담을꺼당
		///// 제네릭을 안쓰면, 어떤 타입이든 다 넣겠다!But, 명시해주는게 좋다!
		
		Module m2 = new Module();
		m2.run();
		
		MyModule m3 = new MyModule ();
		m3.run();
		
		List<Unit> list = new ArrayList<Unit>();
		Scanner scanner = new Scanner(System.in);
		
		
		
		while (true) {
			System.out.println("--------------------------------------");
			System.out.println("1.마린생성 2.파이어뱃생성 3.현   황");
			System.out.println("4.위치변경 5.공격력 증 가 6.공격하기");
			System.out.println("(종료하려면 아무키나 누르세요.)");
			System.out.println("--------------------------------------");

			int num = scanner.nextInt();

			switch (num) {
			case 1:

				System.out.println("생성할 마린의 HP를 입력하세요 : ");
				int mHp = scanner.nextInt();
				System.out.println("생성할 마린의 HIT을 입력하세요 : ");
				int mHit = scanner.nextInt();
				System.out.println("생성할 마린의 이름을 입력하세요 : ");
				String mName = scanner.next();

				
				Marine m = new Marine(mHp, mHit, mName);
				OnDiedListener onDiedListenerImp1 = new OnDiedListener(){
					public void onDied(){
						System.out.print(mName+"죽었습니다다다다다.");
					}
				};				
				m.setOnDiedListener(onDiedListenerImp1);
						
					
				
				
				System.out.println("마린이 생성되었습니다.\n");
				list.add(m);
				break;
			// continue;만나면 그 범위의 맨위로 간다.

			case 2:

				System.out.println("생성할 파이어뱃의 HP를 입력하세요 : ");
				int fHp = scanner.nextInt();
				System.out.println("생성할 파이어뱃의 HIT을 입력하세요 : ");
				int fHit = scanner.nextInt();
				System.out.println("생성할 파이어뱃의 이름을 입력하세요 : ");
				String fName = scanner.next();

				FireBet f = new FireBet(fHp, fHit, fName);

				System.out.println("파이어뱃이 생성되었습니다.\n");
				list.add(f);
				break;

			case 3:

				int a = 0;
				for (Unit unit : list) {
					if ((unit.getHp()) > 0) {
						unit.seeState();
						a++;
					}
				}
				//걸러서 하는 것보다 list에서 뺀다. 모든 개발자가 들어왓을때 실수가없겡
				System.out.println("총 " + a + "마리가 있습니다.");

				break;

			case 4:

				System.out.println("이동할 Unit을 선택하세요");
				//
				for (Unit unit : list) {
					System.out.println(list.indexOf(unit) + ".");
					unit.seeState();
				}
				
				int num2 = scanner.nextInt();
				Unit unit = list.get(num2);
				//중복코드는 selectUnit으로 만들기
				
				boolean run = true;
				while (run) {
					System.out.println("1.오른쪽으로 이동 2.아래로 이동");
					int num3 = scanner.nextInt();

					switch (num3) {
					case 1:
						list.get(num2).right();//goRight으로 하깅
						run = false;
						break;
					case 2:
						list.get(num2).down();
						run = false;
						break;
					default:
						System.out.println("다시 선택하세요.");
						break;
					}
				}

				break;

			case 5:
				System.out.println("업그레이드 할 Unit을 선택하세요");
				for (Unit unit4 : list) {
					System.out.println(list.indexOf(unit4) + ".");
					unit4.seeState();
				}

				int num6 = scanner.nextInt();
				Unit unit4 = list.get(num6);

				unit4.Upgrade();
				//메소드를 따로빼서 새로운 스코프안에서 놀게하깅
				
				break;

			case 6:

				System.out.println("공격할 Unit을 선택하세요");
				for (Unit selectedUnit : list) {
					System.out.println(list.indexOf(selectedUnit) + ".");
					selectedUnit.seeState();
				}

				int num4 = scanner.nextInt();
				Unit selectedUnit = list.get(num4);

				System.out.println("공격할 대상을 선택하세요");

				List<Unit> attackableUnitList = new ArrayList<Unit>();
				
				//list안에 죽은애들도잇다.
				for (Unit unit3 : list) {
					if (unit3 != selectedUnit && selectedUnit.isAttackable(unit3)) {
						attackableUnitList.add(unit3);
						System.out.println(attackableUnitList.indexOf(unit3) + ".");
						unit3.seeState();
					}
				}

				if (attackableUnitList.size() == 0) {
					System.out.println("공격가능한 UNIT이 없습니다.");
				} else {
					int num5 = scanner.nextInt();
					Unit targetUnit = attackableUnitList.get(num5);
					
					selectedUnit.Attack(targetUnit);
				}

				break;
			// 누가 누구를 공격한다.
			// 좌표라는 개념을 넣는다.(0,0)~(100,100)
			// unit은 (0,0)에서 생성되고 어느 위치로 이동할 수 있다.
			// 공격거리까지 계산가능.

			default:
				System.out.println("종료합니다.");
				return;
			}
		}

	}

}
