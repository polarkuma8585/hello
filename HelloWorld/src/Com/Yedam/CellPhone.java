package Com.Yedam;

public class CellPhone {
	String model;
	String color;
	
	public CellPhone() {
		super(); // extends 라는 키워드를 쓰지 않은 한 모든 클래스가 java 내의 object 클래스를 부모 클래스로 지정.
		
	}

	public CellPhone(String model, String color) {
		super();
		this.model = model;
		this.color = color;
	};
	
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨을 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
	
}
