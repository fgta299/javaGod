package c.string;

public class StringCheck {
	public static void main(String[] args) {
		StringCheck sample = new StringCheck();

		String addresses[] = new String[] { "����� ���α� �ŵ�����", "��⵵ ������ �д籸 ���ڵ� ���� ����", "����� ���α� ������" };
		sample.checkLastIndexOf();
	}

	private void checkAddresse(String[] addresses) {
		int startCount = 0, endCount = 0;

		String startText = "�����";
		String endText = "��";
		for (String address : addresses) {
			if (address.startsWith(startText)) {
				startCount++;
			}
			if (address.endsWith(endText)) {
				endCount++;
			}
		}
		System.out.println("Starts with " + startText + " count is " + startCount);
		System.out.println("Ends with " + endText + " count is " + endCount);
	}

	private void containCountsAddress(String[] addresses) {
		int containCount = 0;
		String containText = "����";
		for (String address : addresses) {
			if (address.contains(containText)) {
				containCount++;
			}
		}
		System.out.println("Contains " + containText + " count is " + containCount);
	}

	private void checkMatch() {
		String text = "This is a text";
		String compare1 = "is";
		String compare2 = "this";

		System.out.println(text.regionMatches(2, compare1, 0, 1));
		System.out.println(text.regionMatches(5, compare1, 0, 2));
		System.out.println(text.regionMatches(true, 2, compare1, 0, 4));
	}

	private void checkIndexOf() {
		String text = "Java technology is both a programming language and a platform.";

		System.out.println(text.indexOf('a'));
		System.out.println(text.indexOf("a "));
		System.out.println(text.indexOf('a', 20));
		System.out.println(text.indexOf("a ", 20));
		System.out.println(text.indexOf('z'));
	}

	private void checkLastIndexOf() {
		String text = "Java technology is both a programming language and a platform.";

		System.out.println(text.lastIndexOf('a'));
		System.out.println(text.lastIndexOf("a "));
		System.out.println(text.lastIndexOf('a', 20));
		System.out.println(text.lastIndexOf("a ", 20));
		System.out.println(text.lastIndexOf('z'));
	}

}
