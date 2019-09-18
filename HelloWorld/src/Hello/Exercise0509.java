package Hello;

import java.util.Scanner;

public class Exercise0509 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];   //비어있는 scores 배열에 학생수 입력값의 배열 추가.
			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores [" + i + "]> ");
					scores[i] = scanner.nextInt();
				}
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores [" + i + "]" + scores[i]);
				}
			} else if (selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i = 0; i < scores.length; i++) {
					max = max > scores[i] ? max : scores[i]; // 최고점수를 max에 대입
					sum += scores[i];  // avg 계산을 위한 합 도출
				}
				avg = (double) sum / scores.length;  // avg가 실수 이기때문에 sum을 실수로 맞춰줌.
				System.out.println("최고점수: " + max);
				System.out.printf("평균점수: %.3f" + avg);
			} else if (selectNo == 5) {
				run = false;

			}

		}
		System.out.println("프로그램 종료");
	}
}
