package Hello;

public class WhileExample {
	public static void main(String[] args) {
	//4단 출력
		int i =1;
		while(true) {
			if(i++ <= 5)
				continue;
//		while(i <= 9) {
			System.out.println(4 + "*"+ i + "=" + 4*i);
			if(i == 9)
				break;
//			i++;
//			while(true) {
//			System.out.println(4 + "*"+ i + "=" + 4*i);
//			if(i==9)
//				break;
//			i++;
		
		}
	}
}