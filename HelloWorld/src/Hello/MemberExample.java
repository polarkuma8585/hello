package Hello;

import java.util.Scanner;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member();

		m1.setName("Jeong");
		m1.setId("jjh");
		m1.setPassword("wogma");
		m1.setAge(35);

		Member m2 = new Member("관리자", "admin");

		m2.setPassword("admin");
		m2.setAge(35);

		Member m3 = new Member("사용자", "user1", "user123", 10);

		Member[] Maary = { m1, m2, m3 };
//		Maary[0] = m1;  // 배열에 값을 넣는 다른 방법.
//		Maary[1] = m2;
//		Maary[2] = m3;
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		String name = sc.nextLine(); // String 입력
//		for (Member m : Maary)
			for (int i=0; i<=Maary.length;i++){
			if (Maary[i].getName().equals(name)) // String 의 값이 같은 값을 검색. equals
				System.out.println(Maary[i].getId() + "," + Maary[i].getPassword() + "," + Maary[i].getAge() + "," + Maary[i].getName());

		}
	}
}
