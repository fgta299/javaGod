package game;

import java.util.Random;
import java.util.Scanner;

public class NewGmae {

	int strike = 0, ball = 0, out = 0, difficulty = 0, num = 0;

	String[] answer;

	Scanner sc = new Scanner(System.in);
	Random random = new Random();

	private void setAnswer() {
		System.out.print("\n���� ���̵��� �����Ͻÿ�.(������ ������ �ǹ��մϴ�. �ִ� : 9): ");
		difficulty = sc.nextInt();
		if (difficulty <= 9 && difficulty >= 1) {
			answer = new String[difficulty];
			for (int i = 0; i < difficulty; i++) {
				answer[i] = String.valueOf(random.nextInt(10));
			}
			for (String i : answer) {
				System.out.println(i);
			}
			check();
		} else {
			System.out.println("�ùٸ� ���� �Է����ּ���");
			setAnswer();
		}
	}

	private void check() {
		strike = 0;
		ball = 0;
		System.out.print("\n���� ���� ������(" + difficulty + " �ڸ��� �Դϴ�.): ");
		String in = sc.next();
		if (in.length() == difficulty) {
			num++;
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
			if (0 == strike && 0 == ball) {
				out++;
			}
			System.out.println("��� :[" + strike + "] ��Ʈ����ũ / [" + ball + "] �� / [" + out + "] �ƿ�");
			if (out == 3) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("3�ƿ� �Դϴ�.");
				System.out.printf("�õ� Ƚ�� [ " + num + " ] ���Դϴ�.");
				reGame();
			}
			if (difficulty == strike) {
				System.out.println("\n\n---------------------------------\n");
				System.out.println("�����մϴ�! �����Դϴ�!");
				System.out.printf("�õ� Ƚ�� [ " + num + " ] ���Դϴ�.");
				reGame();
			}
		} else {
			System.out.println("�ùٸ� ���� �־��ּ���");
			check();
		}
		check();
	}

	private void reGame() {
		System.out.println("\n\n������ �ٽ� �Ͻðڽ��ϱ�? [ �� / �ƴϿ�]");
		String s = sc.next();
		if (s.equals("�ƴϿ�")) {
			System.out.println("������ �����մϴ�");
			System.exit(0);
		} else if (s.equals("��")) {
			System.out.println("������ �ٽ� �����մϴ�\n\n\n\n\n\n\n");
			setAnswer();
		}
	}

	public static void main(String[] args) {
		System.out.println("�߱� ���� �Դϴ�.");
		new NewGmae().setAnswer();
	}
}
