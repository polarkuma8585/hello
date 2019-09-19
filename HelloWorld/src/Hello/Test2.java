package Hello;

public class Test2 {
	public static void main(String[] args) {  // "SUN" 맨 뒤로 보내기.
		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" }; //제일 간단한 방법은 배열 값을 바꾸는 것.
		for (int i = 1; i <= week.length; i++) {
			System.out.printf("%4s", week[i % 7]); // i가 7이 되었을때 7로 나눈 나머지가 0이 되기때문에 week[0]의 값을 가져옴.
			// if(i == 6) {
			// System.out.printf("%4s", week[0]);
			// }
		}
	}
}
