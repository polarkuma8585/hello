package Hello;

import java.util.Scanner;

public class TestScore {
	private static TestScoreLibrary[] ScoreAry = new TestScoreLibrary[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("==============================================================");
			System.out.println("1. 학생성적등록  2. 전체리스트  3. 학생번호조회  4.전체통계  5.총점기준정렬  6.종료 ");
			System.out.println("==============================================================");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				ScoreStore();
			} else if (menu == 2) {
				getList();
			} else if (menu == 3) {
				getStudentList();
			} else if (menu == 4) {
				SumandAvg();
			} else if (menu == 5) {
				SumList();
			} else if (menu == 6) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	public static void ScoreStore() {
		System.out.println("학생 성적을 등록합니다.");
		System.out.println("학생번호: ");
		int studentNo = sc.nextInt();
		sc.nextLine();
		System.out.println("이름:");
		String Name = sc.nextLine();
		System.out.println("국어 점수:");
		int Korean = sc.nextInt();
		sc.nextLine();
		System.out.println("영어 점수:");
		int English = sc.nextInt();
		sc.nextLine();
		System.out.println("수학 점수:");
		int Math = sc.nextInt();

		TestScoreLibrary tsl = new TestScoreLibrary(studentNo, Name, Korean, English, Math);
		tsl.setSum(Korean, English, Math);
		for (int i = 0; i < ScoreAry.length; i++) {
			if (ScoreAry[i] == null) {
				ScoreAry[i] = tsl;

				break;
			}
		}
	}

	public static void getList() {
		System.out.println("전체리스트입니다.");
		for (TestScoreLibrary tl : ScoreAry) {
			if (tl != null)
				System.out.println("학생번호:" + tl.getStudentno() + ", 이름: " + tl.getName() + ", 국어점수: " + tl.getKorean()
						+ ", 영어점수: " + tl.getEnglish() + ", 수학점수:" + tl.getMath());
		}
	}

	public static void getStudentList() {
		System.out.println("학생번호 입력: ");
		int studentNo = sc.nextInt();
		for (TestScoreLibrary tl : ScoreAry) {
			if (tl != null && tl.getStudentno() == studentNo) {
				System.out.println("학생번호:" + tl.getStudentno() + ", 이름: " + tl.getName() + ", 국어점수: " + tl.getKorean()
						+ ", 영어점수: " + tl.getEnglish() + ", 수학점수:" + tl.getMath() + ", 총점: " + tl.getSum());

			}

		}

	}

	public static void SumandAvg() {
		System.out.println("반 전체 점수와 평균");
		int i = 0;
		int a = 0;
		int allsum = 0;
		double avg = 0;
		for (TestScoreLibrary tl : ScoreAry) {
			if (tl != null) {
				a++;
				allsum += tl.getSum();
			}
			avg = (double) allsum / a; // null 아닌 배열의 길이 값을 구하는 방법은??
		}

		System.out.println("반 전체 총점: " + allsum + " 반 전체 평균: " + avg);

	}

	public static void SumList() {
		int i = 0;
		TestScoreLibrary temp = null;
		System.out.println("총점 기준 정렬");
		for (TestScoreLibrary tl : ScoreAry) {
			if (ScoreAry[i].getSum() < ScoreAry[i + 1].getSum()) {
				temp = ScoreAry[i + 1];
				ScoreAry[i + 1] = ScoreAry[i];
				ScoreAry[i] = temp;

				System.out.println("학생번호: " + ScoreAry[i].getStudentno() + " 학생이름 :" + ScoreAry[i].getName() + ", 총점: "
						+ ScoreAry[i].getSum());

			}

		}

	}

}
