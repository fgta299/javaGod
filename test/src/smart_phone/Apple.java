package smart_phone;

public class Apple extends Phone{
	
	public Apple() {
		super("����-������13", 2, "������13", "����", "130����");
		
		if(num == 10) {
			Siri();
		}
	}
	
	public void Siri(){
		System.out.print("�˻��ܾ� > ");
		
		String in = sc.next();
		
		System.out.println("\n��� = >"+in+"�� "+in.length()+"���� �Դϴ�.");
		System.out.println("�˻��� �� �Ͻðڽ��ϱ�?");
		System.out.print(" > ");
		in = sc.next();
		
		if(in.equals("��")) {
			Siri();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
