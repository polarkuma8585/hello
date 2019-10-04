package Hello;

public class TestExample {
	public static void main(String[] args) {
		int result = 0;
		int a = 3;
		int b = 7;
		for (int i = 3; i < 200; i++) {
			int c = i % a;
			int d = i % b;
			if (c == 0 && d == 0) {
				result = i;	
			}
			
		}
		System.out.println(result);
		
	}
}
