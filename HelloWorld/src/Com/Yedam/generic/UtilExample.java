package Com.Yedam.generic;

public class UtilExample {
	public static void main(String[] args) {
		Pair<String, Integer> pair = new Pair<>("홍길동", 35);
		Integer age = Utils.getValue(pair, "홍길동");
		System.out.println(age);
		Pair<Integer, String> p2 = new Pair<>(10, "홍길동");
		Utils.getValue(p2, 10);
		String returnVal = Utils.getValue(p2, 10);
		System.out.println(returnVal);
		
		ChildPair<String, Integer> childPair = new ChildPair<>("홍삼원", 20);
		Integer childAge = Utils.getValue(childPair, "홍삼순");
		System.out.println(childAge);
				
//		OtherPair<String, Integer> otherPair = new OtherPair<>("홍삼원", 20);
//		OtherPair 는 Pair를 상속하지 않으므로 예외가 발생해야 합니다.
//		 int ohterAge = Utils.getValue(otherPair, "홍삼원");
//		 System.out.println(otherAge);  
		
	}
}
