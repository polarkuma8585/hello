package Com.Yedam.exception;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			System.out.println("data1 : " + data1);
			System.out.println("data2 : " + data2);
			int val1 = Integer.parseInt(data1);
			int val2 = Integer.parseInt(data2);
			System.out.println("sum: " + (val1 + val2));

		} catch (Exception e) { // 모든 예외처리 클래스 중 최상위 클래스 - 예외처리 유형을 모를 떄 사용 가능.	
//		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("매개값의 개수와 유형을 확인하세요.");
			System.out.println("매개변수 2개가 필요합니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}

		System.out.println("프로그램의 종료.");
	}
}
