package Com.Yedam.lambda;

@FunctionalInterface // 인터페이스 중에 구현해야할 메소드가 하나밖에 없는것 = 펑셔널 인터페이스 = 람다표현식의 계산구조
// @FunctionalInterface 인터페이스의 메소드 = 람다식 표현양식 체크.
interface MyInterface {
	int print(int a, int b);

}

//class MyInterfaceClass implements MyInterface {
//
//	@Override
//	public int print(int a, int b) {
//		return a + b;
//	}
//}

public class LambdaBasicExample {
	public static void main(String[] args) {
//		MyInterface mi = new MyInterfaceClass();
//		int result = mi.print(4, 9);
//		System.out.println("결과 값은: " + result);

		MyInterface mi = (c, d) -> {
			return c * d;
		};// 람다표현식. 익명구현객체

		int result = mi.print(3, 5);
		System.out.println("결과 값은: " + result);

		mi = new MyInterface() {

			@Override
			public int print(int a, int b) {
				return a - b;
			}

		};
		result = mi.print(7, 4);
		System.out.println("결과 값은: " + result);

		// mi.print(8, 4) --> "결과값은: /"
		mi = (a, b) -> {
			return a / b;
		};

		System.out.println("결과값은:" + mi.print(8, 4) + "입니다.");

	}
}
