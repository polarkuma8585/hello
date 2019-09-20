package Classes;

import java.util.Scanner;

public class MoneyDivTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("금액을 입력하세요.");
		int money = sc.nextInt();
		Exchange(money);
		sc.close();
	}
	public static void Exchange(int a) {
		int money = a;
		int result = 0, remain = 0;
		for(int j=0; j<8;j++) {
			int[] Ary = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			result = money / Ary[j];
			remain = money % Ary[j];
			System.out.println(Ary[j]+ "원짜리"+ result + "개");
			money = remain; // money에 나머지값을 넣어 다음 순환에 대입시킨다.
		}			
//		result = i/50000;
//		remain = i%50000;
//		
//		i = remain;
//		result = i / 10000;
//		remain = i % 10000;
//		
//		i = remain;
//		result = i/5000;
//		remain = i%5000;
//		
//		i = remain;
//		result = i/1000;
//		remain = i%1000;
//		
//		i = remain;
//		result = i/500;
//		remain = i%500;
//		
//		i = remain;
//		result = i/100;
//		remain = i%100;
//		
//		i = remain;
//		result = i/50;
//		remain = i%50;
//		
//		i = remain;
//		result = i/10;
//		remain = i%10;
//		
//		i = remain;
		
		
			 
			 
			 
			
			

			
		}
		
		
		
		
		
		
		
		
		
	}

