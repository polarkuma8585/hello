package Hello;

public class MethodExample3 {
	public static void main(String[] args) {
//		printStar(2, "&");
//
//		System.out.println();
//		
//		int[] intAry = { 1, 2, 3, 4, 5 };
//		int sum = 0;
//		sum = sumArray(intAry);
//		System.out.println("합은:" + sum);
//
//		int[] intAry2 = { 1, 2, 3, 4, 5, 6 };
//		sum = sumArray(intAry2);
//		System.out.println("합은:" + sum);
//
//		int[] intAry3 = { 1, 2, 3 };
//		sum = sumArray(intAry3);
//		System.out.println("합은:" + sum);

//		Starprint(6, 7);
//		printStar(8);
		int[] ary = showArray(1, 2, 3, 4, 5);
		for (int i = 0; i < ary.length; i++) {
			System.out.println(ary[i]);
		}
		// ==> enhanced for
		for (int a : ary) {
			System.out.println(a);
		}
	}

	public static void printStar(int a, String str) {
		for (int i = 0; i < a; i++) {
			System.out.print(str);
		}
	}

	public static int sumArray(int[] ary) { // 배열 내에 있는 값의 합 계산 메소드. //( ) 안에 있는 타입만 받아서 사용가능.
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		return sum;
	}

//	public static void Starprint(int a, int b) { // 1부터 변수값만큼 순차적으로 증가 출력하는 메소드
//		int c = 1;
//		for (int i = 0; i < b; i++) {
//
//			for (int j = 0; j < a; j++) {
//				System.out.printf("%3d", c++);
//			}
//			System.out.println();
//		}
//	}

//	public static void Starprint(int a) { // 하나의 변수값 만으로 여러 행과 열의 결과값을 출력하는 메소드
//	
//	for (int i = 0; i < a; i++) {
//		
//		for (int j = 0; j < a; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//}
//	public static void printStar(int a) { //역피라미드 * 출력
//		for (int i = 1; i <= a; i++) {
//			for (int j = a; j >= i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
	public static int[] showArray(int a, int b, int c, int d, int e) {
		int[] ary = { a * 2, b * 2, c * 2, d * 2, e * 2 };
		return ary;
	}

	public static int[] showArray(int... arg) {
		int[] aAry = new int[arg.length];
		for (int i = 0; i < aAry.length; i++) {
			aAry[i] = arg[i];
		}
		return aAry;

	}
}
