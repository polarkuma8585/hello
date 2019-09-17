package Hello;

import java.util.Scanner;

public class GetMaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] intAry = new int[5];

		for (int i = 0; i < intAry.length; i++) {
			System.out.println("intAry 값 입력:");
			intAry[i] = sc.nextInt();
		}
		int maxValue = 0;
		for (int i = 0; i < intAry.length; i++) { // intAry.length 의 크기만큼 반복수행.
			if (maxValue < intAry[i])
				maxValue = intAry[i];
			//			maxValue = (maxValue > intAry[i] ? maxValue : intAry[i]);
		}

		System.out.println("큰 값은? " + maxValue);

	}
}
