package Hello;

public class Exercise0405 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		for(int i = 1; i <= 10; i++) {
			for(int  j= 1; j <=10; j++) {
				num1 = i;
				num2 = j;
				if((4*i)+(5*j) == 60)	// 이해는 했지만 스스로 안됨.
					System.out.println("(" + num1 + "," + num2 + ")");
			}
			
		}
	}
}