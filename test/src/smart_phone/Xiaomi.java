package smart_phone;

public class Xiaomi extends Phone{
	
	public Xiaomi() {
		super("������-ȫ�̳�Ʈ11", 3, "ȫ�̳�Ʈ11", "������", "30����");
		
		if(num == 10) {
			HeyGoogle();
		}
	}
	
	public void HeyGoogle() {
		System.out.print("�˻��ܾ� > ");
		
		String in = sc.next();
		
		System.out.println("\n��� = >"+in+"�� "+in.length()+"���� �Դϴ�.");
		System.out.println("�˻��� �� �Ͻðڽ��ϱ�?");
		System.out.print(" > ");
		in = sc.next();
		
		if(in.equals("��")) {
			HeyGoogle();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
