package Classes;

public class Student {
	// 특성(필드)
	String name;
	String major;
	int studentNo;
	
	// 생성자
	Student() { // 생성자 정의를 했을 경우 반드시 기본생성자를 만들어 줘야 함. 그렇지 않을 경우 에러 발생.

	}

	Student(String name) {
		this.name = name; // this 는 객체 자신
	}

	Student(String name, String major) {
		this.name = name;
		this.major = major;
		
	}

	// 기능(메소드)
	void study() {
		System.out.println("공부합니다.");

	}

	void goToSchool() {
		System.out.println("학교갑니다.");
	}
}
