package Classes;

import java.util.Scanner;

public class CalculExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Calculator cal = new Calculator();
		Calculator.minus(23.5, 10.2); // static - 인스턴스를 만들지 않아도 메소드 영역에 올라와 있기 때문에 실행 가능.
		Calculator.plus(23.5, 10.2); // static

//		System.out.println("첫번째 정수 입력 :");
//		int a = sc.nextInt();
//		System.out.println("두번째 정수 입력 :");
//		int b = sc.nextInt();
//		cal.execute(a, b);

	}
}
