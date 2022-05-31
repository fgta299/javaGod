package test;

import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int difficulty = 0, num = 0, out = 0;
		String in;

		Scanner sc = new Scanner(System.in);
		Random random = new Random();

		System.out.println("�߱� ���� �Դϴ�.");
		while (true) {
			System.out.print("\n���� ���̵��� �����Ͻÿ�.(������ ������ �ǹ� �մϴ�. �ִ�:9): ");
			difficulty = sc.nextInt();
			if (difficulty <= 9 && difficulty >= 1) {
				break;
			} else {
				System.out.println("�ùٸ� ���� �Է����ּ���");
			}
		}

		String[] answer = new String[difficulty];

		for (int i = 0; i < difficulty; i++) {
			answer[i] = String.valueOf(random.nextInt(10));
		}

//		for(int i = 0; i < difficulty; i++) {
//			System.out.println(answer[i]);
//		}

//		System.out.println("test : ");
//		String test = sc.nextLine();
//		
//		System.out.println("1��" + test.substring(0,1));	

		while (true) {
			int strike = 0, ball = 0;
			num++;
			if (out < 3) {
				while (true) {
					System.out.print("\n���� ���� ������ (" + difficulty + " �ڸ��� �Դϴ�.): ");
					in = sc.next();
					if (in.length() == answer.length) {
						break;
					} else {
						System.out.println("�ùٸ� ������ ���� �־��ּ���");
					}
				}
				for (int i = 0; i < difficulty; i++) {
					String temp = in.substring(i, i + 1);
					if (temp.equals(answer[i])) {
						// ��Ʈ����ũ
						strike++;
					} else {
						for (int y = 0; y < difficulty; y++) {
							if (temp.equals(answer[y])) {
								// ��
								ball++;
							}
						}
					}
				}
				if (strike == 0 && ball == 0) {
					out++;
				}
				System.out.println("��� :[" + strike + "] ��Ʈ����ũ / [" + ball + "] �� / [" + out + "] �ƿ�");
			} else {
				System.out.println("3�ƿ� �Դϴ�");
				break;
			}

			if (strike == difficulty) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("�����մϴ�! �����Դϴ�!");
				System.out.println("�õ� Ƚ�� [" + num + "] �� �Դϴ�.");

				break;
			}
		}
		System.out.println("\n������ �ٽ� �Ͻðڽ��ϱ�? [ �� / �ƴϿ� ]");
		in = sc.next();
		if (in.equals("��")) {
			main(null);
		} else if (in.equals("�ƴϿ�")) {
			System.out.println("������ �����մϴ�");
		} else {
			System.out.println("�ùٸ� ���� �Է����ּ���");
		}
	}
}