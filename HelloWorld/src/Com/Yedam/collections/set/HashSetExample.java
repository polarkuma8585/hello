package Com.Yedam.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet = new HashSet<>();
	
		
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("홍길동", 30));
		System.out.println("memSet의 객체수: " + memSet.size());
		for (Member m : memSet) {
			System.out.println(m.name + "/" + m.age);
		}

		Set<String> set = new HashSet<>();
		set.add("Hello");
		set.add("World");
		set.add("Nice");
		set.add("Java");
		set.add("World");
		System.out.println("객체수: " + set.size());
		// set의 특징 1. 중복된 건 허용하지 않음.
		Iterator<String> iter = set.iterator();
		// 반복자 Iterator
		while (iter.hasNext()) {
			// hasNext() - 읽어올 값이 있는가.
			System.out.println(iter.next());
			// next() - 값을 가져옴.
		}
		System.out.println("반복자 소진 후 :");
		iter = set.iterator();
		while (iter.hasNext()) {
			// hasNext() - 읽어올 값이 있는가.
			System.out.println(iter.next());
			// next() - 값을 가져옴.
		}
		set.remove("Nice");
		// 특징 2. Object 타입으로만 삭제 가능.
		System.out.println("확장 for:");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
