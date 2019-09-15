package Hello;

public class Exercise0404 {
	public static void main(String[] args) {
		
		while(true) {
			int i = (int)(Math.random()*6) + 1;   //Math.random() 이 while 위로 가면 같은 숫자만 출력되는 건 왜 그런지 질문.
			int j = (int)(Math.random()*6) + 1;
			if(i+j != 5) {
			System.out.println("(" + i + "," + j + ")");
				} if(i+j == 5) {
			
					System.out.println("주사위의 합이 5 이므로 프로그램을 종료합니다.");
					break; 
				}
		}
	}
}