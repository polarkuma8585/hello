package Hello;

public class AlphabetTest {
	public static void main(String[] args) {
		char chr = 'A';
		int num = chr;
		for(int i= 0; i <26; i++)
			System.out.println(chr++ + "," + num++);
//		for(chr = 'A'; chr<='Z'; chr++ ) {
//			
//			System.out.println(chr);
//		}
	}
}
