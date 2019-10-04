package Com.Yedam;

import java.util.Scanner;

public class MemberExample {
	private static Member[] memberArray = new Member[10];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("------------------------------");
			System.out.println("|1.회원등록|2.회원번호조회|3.등록 그룹별 리스트|4.종료");
			System.out.println("------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				CreateMember();
			} else if (menu == 2) {
				getMember();
			} else if (menu == 3) {
				getGroupList();
			} else if (menu == 4) {
				run = false;
			}

		}
		System.out.println("프로그램 종료.");
	}

	public static void CreateMember() {
		System.out.println("멤버를 생성합니다.");
		System.out.println("회원번호 입력");
		int Mid = sc.nextInt();
		sc.hasNextLine();
		System.out.println("이름 입력");
		String Mname = sc.nextLine();
		System.out.println("등록 과정 입력");
		String Cname = sc.nextLine();
		Member member = new Member(Mid, Mname, Cname);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = member;
				break;
			}
		}

	}

	public static void getMember() {
		System.out.println("회원번호 입력:");
		int Mid = sc.nextInt();
		for (Member m : memberArray) {
			if (m != null && m.getId().equals(Mid)) {
				System.out.println("회원번호: " + m.getId() + "회원 이름: " + m.getName() + "등록 과정: " + m.getClassname());
				break;
			}else {
				System.out.println("존재하지 않는 회원번호입니다.");
				break;
			}
		}
	}

	public static void getGroupList() { // 실패 ㅠㅠ
		System.out.println("그룹별 리스트 입니다.");
		int i = 0;
		Member[] memberAr = new Member[10];
		for (Member m : memberArray) {
			
			
			
			}
		}	
}
