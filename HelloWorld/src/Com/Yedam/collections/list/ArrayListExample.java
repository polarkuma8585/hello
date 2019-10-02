package Com.Yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		// List 인터페이스를 구현하는 ArrayList 클래스.
		List<String> list = new ArrayList<>(); // new String[10];
		list.add("Hello");
		list.add("world");
		list.add("Nice");
		list.add("Java");
		list.add(2, "Insert");
		int size = list.size();
		System.out.println("개체수는 " + size);
		for (int i = 0; i < size; i++) {
			System.out.println("index: " + i + " >> "+ list.get(i));
		}
		System.out.println("================================");
		String returnVal = list.remove(2); //2번 인덱스의 값을 제거.
		
		System.out.println("return: " + returnVal); // null 값이 되면 자동으로 정렬.
		for (String str : list) {
			System.out.println(str);
		}

	}
}
