package smart_phone;

public class Samsung extends Phone{
	
	public Samsung() {
		super("�Ｚ-�ַ���S22", 1, "�ַ���S22", "�Ｚ", "100����");
		
		if(num == 10) {
			Bixby();
		}
		
	}
	
	public void Bixby(){
		System.out.print("�˻��ܾ� > ");
		
		String in = sc.next();
		
		System.out.println("\n��� = >"+in+"�� "+in.length()+"���� �Դϴ�.");
		System.out.println("�˻��� �� �Ͻðڽ��ϱ�?");
		System.out.print(" > ");	
		in = sc.next();
		
		if(in.equals("��")) {
			Bixby();
		}
		num = 0;
		System.out.println("\n==============================\n");
		MainMenu();
	}
}
