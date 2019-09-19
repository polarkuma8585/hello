package Classes;

import java.util.Scanner;

public class CalculExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
		System.out.println("첫번째 정수 입력 :");
		int a = sc.nextInt();
		System.out.println("두번째 정수 입력 :");
		int b = sc.nextInt();
		cal.execute(a, b);
				
	
		
		
		
	}
}
