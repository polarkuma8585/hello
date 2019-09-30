package Hello;

import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i, j = 0;
		boolean a = true;
		int[] ran = new int[3];
		for (i = 0; i < ran.length; i++) {
			ran[i] = (int) (Math.random() * 9 + 1);
		}
			for (j = 0; j < i; j++) {
				if (ran[i] == ran[j]) {
					i--;
					break;
				}
			}

			System.out.println(ran[i]);

		

		while (a) {
			int[] insert = new int[3];
			for (i = 0; i < insert.length; i++) {
				System.out.println("세 번 스윙하세요.");
				insert[i] = sc.nextInt();
			}
			int strike = 0;
			int ball = 0;
			int out = 0;
			for (i = 0; i < ran.length; i++) {
				for (j = 0; j < insert.length; j++) {
					if (ran[i] == insert[j] && i == j) {
						strike++;
						break;
					} else if (ran[i] == insert[j] && i != j) {
						ball++;

					}

				}
			}
			System.out.println(strike + "Strike" + ball + "ball");
			if (strike == 3) {
				a = false;

			}

		}

	}
}
