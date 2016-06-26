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
		
		
		//�Ǿ��� �빮�ڰ� �ƴϸ� "������Ƽ��"
		//�Ǿ��� �빮�ڸ� "Ŭ����"
		//call by reference
		//call by value
		//NULL:�ƹ��͵� ���� �ּҸ� �������ִ�.		
		
		
		
		
		//List<Marine> list= new ArrayList<Marine>();//������ ���� �����̳� ����(�迭)-Ž������
		//List<Marine> list2 = new LinkedList<Marine>();//��ũ�� ����Ʈ-��������
		//////���׸�//////����ư�� ������ ��������
		/////���׸��� �Ⱦ���, � Ÿ���̵� �� �ְڴ�!But, ������ִ°� ����!
		List<Unit> list= new ArrayList<Unit>();
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
			System.out.println("--------------------------------------");
			System.out.println("1.�������� 2.���̾����� 3.��   Ȳ");
			System.out.println("4.��ġ���� 5.���ݷ� �� �� 6.�����ϱ�");
			System.out.println("(�����Ϸ��� �ƹ�Ű�� ��������.)");
			System.out.println("--------------------------------------");
			
			int num = scanner.nextInt();
			
			switch(num){
			case 1 :
			
				System.out.println("������ ������ HP�� �Է��ϼ��� : ");
				int mHp= scanner.nextInt();
				System.out.println("������ ������ HIT�� �Է��ϼ��� : ");
				int mHit = scanner.nextInt();
				System.out.println("������ ������ �̸��� �Է��ϼ��� : ");
				String mName = scanner.next();
				
		
				Marine m = new Marine(mHp,mHit,mName);
				
				System.out.println("������ �����Ǿ����ϴ�.\n");
				list.add(m);						
				break;
				//continue;������ �� ������ ������ ����.
				
			case 2 :
				
				System.out.println("������ ���̾���� HP�� �Է��ϼ��� : ");
				int fHp= scanner.nextInt();
				System.out.println("������ ���̾���� HIT�� �Է��ϼ��� : ");
				int fHit = scanner.nextInt();
				System.out.println("������ ���̾���� �̸��� �Է��ϼ��� : ");
				String fName = scanner.next();
				
				FireBet f = new FireBet(fHp,fHit,fName);
				
				System.out.println("���̾���� �����Ǿ����ϴ�.\n");				
				list.add(f);						
				break;
				
			case 3 :
			System.out.println("�� "+list.size()+"������ �ֽ��ϴ�.");
							
			for(Unit unit : list) {					
				unit.seeState();		
			}
			break;
			
			case 4 :			
				System.out.println("�̵��� Unit�� �����ϼ���");
											
				for(Unit unit : list) {					
					System.out.println(list.indexOf(unit)+".");
					unit.seeState();		
				}
				
				int num2 = scanner.nextInt();
				Unit unit=list.get(num2);
				
				System.out.println("1.���������� �̵� 2.�Ʒ��� �̵�");	
				
				int num3 = scanner.nextInt();				
				switch(num3){
				case 1 :
					list.get(num2).right();
					break;
				case 2 :
					list.get(num2).down();
					break;				
					}
				
				break;			
			case 5 :
				System.out.println("���׷��̵� �� Unit�� �����ϼ���");
				for(Unit unit4 : list) {					
					System.out.println(list.indexOf(unit4)+".");
					unit4.seeState();
				}
				
				int num6 = scanner.nextInt();
				Unit unit4=list.get(num6);
				
				unit4.Upgrade();
				
				break;
				
			case 6 :
				System.out.println("������ Unit�� �����ϼ���");
				
				for(Unit unit2 : list) {					
					System.out.println(list.indexOf(unit2)+".");
					unit2.seeState();		
				}
				int num4 = scanner.nextInt();
				Unit unit2=list.get(num4);
				
				System.out.println("������ ����� �����ϼ���");
				
				for(Unit unit3 : list) {
					
					if(list.indexOf(unit3)!=num4){
					System.out.println(list.indexOf(unit3)+".");
					unit3.seeState();
					}
				}
				int num5 = scanner.nextInt();
				Unit unit3=list.get(num5);
				
				unit2.Attack(unit3);	
				
				break;					
				//���� ������ �����Ѵ�.
				//��ǥ��� ������ �ִ´�.(0,0)~(100,100)
				//unit�� (0,0)���� �����ǰ� ��� ��ġ�� �̵��� �� �ִ�.
				//���ݰŸ����� ��갡��.
				
			default :
				System.out.println("�����մϴ�.");
				return;
			}
		}
		
	}

}
