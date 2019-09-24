package Hello;

import java.util.Scanner;

public class MemberExample2 {
	private static Member[] memberArray = new Member[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("-----------------------------------------------");
			System.out.println("| 1.멤버생성 | 2.멤버조회 | 3.ID, Password조회 | 4.종료 |");
			System.out.println("-----------------------------------------------");
			int menu = sc.nextInt();
			sc.nextLine();
			if (menu == 1) {
				CreateMember();
			} else if (menu == 2) {
				getMemberlist();
			} else if (menu == 3) {
				logIn();
			} else if (menu == 4) {
				run = false;
			}
		}
		System.out.println("프로그램 종료.");
	}

	public static void CreateMember() {
		System.out.println("멤버를 생성합니다. ");
		System.out.println("이름 입력: ");
		String memberName = sc.nextLine();
		System.out.println("ID 입력: ");
		String memberId = sc.nextLine();
		System.out.println("password 입력: ");
		String memberPasswd = sc.nextLine();
		System.out.println("나이 입력: ");
		int memberAge = sc.nextInt();
		Member member = new Member(memberName, memberId, memberPasswd, memberAge);
		for (int i = 0; i < memberArray.length; i++) {
			if (memberArray[i] == null) {
				memberArray[i] = member;
				break;
			}

		}
	}

	public static void getMemberlist() {
		System.out.println("멤버리스트");
		for (Member m : memberArray) {
			if (m != null)
				System.out.println("이름: " + m.getName() + ", ID: " + m.getId() + ", PASSWORD : " + m.getPassword()
						+ ", 나이: " + m.getAge());
		}
	}

	public static void logIn() {
		System.out.println("아이디 입력: ");
		String memberId = sc.nextLine();
		System.out.println("Password 입력: ");
		String memberPasswd = sc.nextLine();
//		boolean isId = false, isPw = false;    // 더 확실한 방법
//		String name = null;
//		int age = 0;
		for (Member mem : memberArray) {
			if (mem != null && mem.getId().contentEquals(memberId)) {
				if (mem.getId().contentEquals(memberId) && mem.getPassword().contentEquals(memberPasswd)) {// id(o),passwd(o)
//					isId = true;
//					isPw = true;
//					name = mem.getName();
//					age = mem.getAge();
					System.out.println("이름: " + mem.getName() + " 나이: " + mem.getAge());
					break;
				} else { // id(o), passwd(x)
//					isId = true;
//					isPw = false; break;
					System.out.println("패스워드가 맞지않습니다.");
					break;
				}

			} else {
//				isId = false;
//				isPw = false;
				System.out.println("계정이 존재하지 않습니다.");

			}

		}

//		if (isId == true && isPw == true)
//			System.out.println("이름은: " + name + ", 나이는" + age);
//		else if (isId == true && isPw == false)
//			System.out.println("비번이 틀립니다.");
//		else if (isId == false && isPw == false)
//			System.out.println("존재하지 않는 ID입니다.");

	}
}
