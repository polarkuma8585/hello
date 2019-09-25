package Com.Yedam;

class Calculator {
	double areaCircle(double r) {
		return 3.14 * r * r;
	}
}

class Computer extends Calculator {
	@Override // 부모 클래스 메소드를 재정리해서 쓴다는 의미
	double areaCircle(double r) {
		return Math.PI * r * r;

	}

	double areaCircle1(double r) {
		return super.areaCircle(r); // 부모클래스의 메소드 재정의시 오리지널 메소드를 불러오기 위해서는 부모 메소드를 불러 올 수 있는 메소드를 다시 만들어 줘야 함.

	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer com = new Computer();
		System.out.println("결과값: " + com.areaCircle(10));
	}
}
