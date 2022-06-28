package smart_phone;

import java.util.Scanner;

public class Phone {
	
	Scanner sc = new Scanner(System.in);
		
	String phoneName, maker, name, price;
	boolean power = false;
	int phoneNum, num;
	
	Phone(String phoneName, int num, String maker, String name, String price){
		this.phoneName = phoneName;
		this.phoneNum = num;

		this.maker = maker;
		this.name = name;
		this.price = price;
		
		MainMenu();
	}
	
	void MainMenu(){
		System.out.println("[�޴� ("+ phoneName +")]");
		System.out.println("1) �������");
		System.out.println("2) ����ON");
		System.out.println("3) ����OFF");
		if(phoneNum == 1) {
			System.out.println("4) �򽺺�");
		} else if(phoneNum == 2) {
			System.out.println("4) �ø�");
		} else if(phoneNum == 3) {
			System.out.println("4) ���̱���");
		}
		System.out.println("5) ��ȭ�ɱ�");
		Scan();
	}
	
	void Scan() {
		System.out.print("���� > ");
		
		num = sc.nextInt();
		
		if(num == 2) {
			System.out.println("[�ڵ��� ������ �������ϴ�.]");
			System.out.println("\n==============================\n");
			power = true;			
			MainMenu();
		}
		
		if(power) {
			if(num == 3) {
				System.out.println("[�ڵ��� ������ �������ϴ�.]");
				System.out.println("\n==============================\n");
				power = false;			
				MainMenu();
			} else if(num == 1) {
				System.out.println("\n==============================\n");
				InfoMenu(); 
			}else if(num == 4) {
				System.out.println("\n==============================\n");
				SelectMenu();
			}else if(num == 5) {
				System.out.println("\n==============================\n");
				Call();
			}
		}else{
			System.out.println("\n[������ ���� ���·δ� ��� ����� ��� �Ұ��մϴ�]");
			System.out.println("\n==============================\n");
			MainMenu();
		}
	}
	
	void Scan(int no) {
		System.out.print("���� > ");
		
		num = sc.nextInt();
		
		if(no == 1) {
			if(num == 1) {
				PhoneInfo();
			}else if(num == 2) {
				PhonePermute();
			}
		}else if(no == 4&& num == 1) {
			num = 10;
		}
	}
	
	void Scan(int no1, int no2) {
		System.out.print("���� > ");
		
		num = sc.nextInt();
		
		if(no1 == 1) {
			if(num == 1) {
				System.out.println("[���� ������13�� ���õǾ����ϴ�]");
				System.out.println("\n==============================\n");
				new Apple();
			}else if(num == 2) {
				System.out.println("[�Ｚ �ַ���S22�� ���õǾ����ϴ�]");	
				System.out.println("\n==============================\n");
				new Samsung();
			}else if(num == 3) {
				System.out.println("[������ ȫ�̳�Ʈ11�� ���õǾ����ϴ�]");
				System.out.println("\n==============================\n");
				new Xiaomi();
			}
		}
	}
	
	void InfoMenu(){
		System.out.println("[�޴� ("+ phoneName +")]");
		System.out.println("1) �������");
		System.out.println("2) ��⺯��");
		
		Scan(1);
	}
	
	void PhoneInfo(){
		System.out.println("\n::::"+ phoneName +"::::");
		System.out.println("������ : "+maker);
		System.out.println("�𵨸� : "+name);
		System.out.println("���� : "+price);
		
		System.out.println("\n==============================\n");
		MainMenu();
	}
	
	void PhonePermute(){
		System.out.println("\n1-����");
		System.out.println("2-�Ｚ");
		System.out.println("3-������");
		
		Scan(1,1);
	}
	
	void SelectMenu() {
		System.out.println("\n[�޴� ("+ phoneName +")]");
		System.out.println("1) �˻�");
		Scan(4);
	}
	
	void Call() {
		int number;
		String name;
		
		System.out.print("��ȭ��ȣ > ");
		number = sc.nextInt();
		System.out.print("�̸� > ");
		name = sc.next();
		
		System.out.println("[��ȭ �Ŵ���]");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[������ ��ȭ�� ���� �ʽ��ϴ�.]");
		System.out.println("\n==============================\n");
		MainMenu();
	}
	
}
