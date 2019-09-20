package Classes;

public class Calculator {
	static double pi = 3.14;

	static double minus(double x, double y) {

		return x - y;
		 
	}

	static double plus(double x, double y) { // static 메소드 영역에서 실행 대기중인 상태.
		return x + y;
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int a, int b) {
		int sum = plus(a, b);
		double result = (double) sum / 2;
		return result;
	}

	void execute(int a, int b) {

		double result = avg(a, b);
		println("result: " + result);
	}

	void println(String str) {
		System.out.println(str);
	}
}
