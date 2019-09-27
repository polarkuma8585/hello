package API;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2"); //index 4위치뒤에 2를 삽입.
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6'); // index 4를 6으로 변경.
		System.out.println(sb.toString());
		
		sb.replace(6, 13, "Book"); //index 6부터 13전까지 Book로 변경.
		System.out.println(sb.toString());
				
		sb.delete(4, 5); // index 4부터 5전까지 삭제.
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: "+ length);
		
		String result = sb.toString();
		System.out.println(result);
				
	}
}
