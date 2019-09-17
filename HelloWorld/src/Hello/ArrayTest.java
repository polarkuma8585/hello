package Hello;

import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("input int type");
//		int a = sc.nextInt(); // 사용자가 값을 입력할때까지 기다림.
//		System.out.println("next input");
//		int b = sc.nextInt();
//		System.out.println("next input");
//		int c = sc.nextInt();
//		int sum = a + b + c;
//		System.out.println("합은: " + sum);
		int[] intAry = new int[5];
//		System.out.println("input intAry type");
//		intAry[0] = sc.nextInt();
//		System.out.println("next input");
//		intAry[1] = sc.nextInt();
//		System.out.println("next input");
//		intAry[2] = sc.nextInt();
//		System.out.println("next input");
//		intAry[3] = sc.nextInt();
//		System.out.println("next input");
//		intAry[4] = sc.nextInt();
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("값을 입력하세요.");
			intAry[i] = sc.nextInt();
		}
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("입력된 intAry의 값은" + intAry[i]);

		}
//		int a,b, result = 0;
//		
//		System.out.println("첬번째 갑을 입력.");
//		a = sc.nextInt();
//		System.out.println("두번째 값을 입력.");
//		b = sc.nextInt();
////		if (a > b)
////				result = a;
////		else
////				result = b;
//		result = (a > b ? a : b);
//		
//		System.out.println("두 수 중에서 큰 수는" + result);
		
		
		
	}
}
