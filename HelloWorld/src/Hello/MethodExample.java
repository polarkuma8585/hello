package Hello;

public class MethodExample {
	public static void main(String[] args) { // args는 매개값.
		int[] intAry = { 2, 3, 4, 5, 6 };
		int sum = 0;
		sum = sum2(intAry);
		System.out.println("합은" + sum);

//		int a = 50;
//		System.out.println(args[0]);
//		showName(); // 다른 메소드를 불러와 실행.
//		showAge(a);
//		showMe(175.7, 65.5); // 호출해서 실행하는 부분에서는 데이터타입의 정의를 하지않음. 데이터타입 정의는 메소드에서.
//
//		
//		double result4 = healthyweight(168);
//		System.out.println("적정 몸무게는 " + result4 + " 입니다.");
//		
//		int result = sum(4, 5);
//		int result1 = minus(5, 4);
//		int result2 = multi(5, 4);
//		double result3 = div(10, 4);
//		System.out.println("결과값: " + result);
//		System.out.println("결과값: " + result1);
//		System.out.println("결과값: " + result2);
//		System.out.println("결과값: " + result3);
//		System.out.println(args[1]);
	}

//	public static double currweight(double weight ) {
//		return weight;
//	}
	public static int sum2(int[] aAry) {
		int sum = 0;
		for (int i = 0; i < aAry.length; i++) {
			sum += aAry[i];
	}
		return sum;
	}

	public static double healthyweight(double height) {
		return (height - 100) * 0.9;
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static int minus(int a, int b) {
		return a - b;
	}

	public static int multi(int a, int b) {
		return a * b;
	}

	public static double div(double a, double b) {
		return a / b;
	}

	public static void showAge(int age) {
		System.out.println("I am " + age + " years old.");
	}

	public static void showMe(double height, double weight) {
		System.out.println("I am " + height + " cm and " + weight + " kg");
	}

	public static void showName() {
		System.out.println("Hello, my name is Jaeheum.");
	}

}
