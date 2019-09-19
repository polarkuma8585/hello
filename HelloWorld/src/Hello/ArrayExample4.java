package Hello;

public class ArrayExample4 {
	public static void main(String[] args) {
		String[] strAry = { "Hello", "World", "Good", "Morning" };
		String[] copyAry = new String[strAry.length];
//		for (int i = 0; i < strAry.length; i++) {
//			copyAry[i] = strAry[i];   //배열 복사
					
//		}
//		for (String str : copyAry) {
//			System.out.println(str);
//		}
		System.arraycopy(strAry, 0, copyAry, 0, strAry.length);  //배열복사 구문.
		for (String str : copyAry) {
			System.out.println(str);
		}
	}}