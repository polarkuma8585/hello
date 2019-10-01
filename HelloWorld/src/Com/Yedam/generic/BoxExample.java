package Com.Yedam.generic;

public class BoxExample {
	public static void main(String[] args) {
		
		Box<String> box = new Box<String>(); //인스턴스 생성 시점에 데이터 타입을 결정.
		box.setObj(new String("hello"));
		String str = box.getObj();
		
		Box<Integer> intBox = new Box<>(); //두번째 Integer 생략해도 됨.
		intBox.setObj(10);
		int intValue = intBox.getObj();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Box box = new Box();
//		box.setObj(new String("Hello"));
//		String strValue = (String) box.getObj();
//		System.out.println(strValue);
//		
//		box.setObj(new Integer(10));
//		int intValue = (int) box.getObj();
//		System.out.println(intValue);
//		
//		box.setObj(new Double(1.1));
//		String newStr = (String) box.getObj();
//		System.out.println(newStr);
	}
}
