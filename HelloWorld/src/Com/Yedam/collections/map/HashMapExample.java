package Com.Yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 60);
		map.put("홍길동", 50);
		// 중복되면 나중에 중복된 값으로 대체
		System.out.println("Entry갯수: " + map.size());
		System.out.println("방법I");// key를 set에 담아서 Iterator로 가져옴.
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next(); 
			System.out.println("key: " + key + " , value: " + map.get(key));
		}

//		for(Entry<String, Integer> ent : map ) {
//			System.out.println();
//		}

	}
}
