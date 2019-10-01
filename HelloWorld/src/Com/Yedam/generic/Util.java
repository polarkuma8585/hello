package Com.Yedam.generic;

public class Util {
	public static <K> Box<K> boxing(K t) {
		Box<K> box = new Box<K>();
		box.setObj(t);
		return box;
	}

	public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool1 && bool2;
	}
	public static <K, V> boolean compareValue(Pair<K, V> p1, Pair<K, V> p2) {
		boolean bool2 = p1.getValue().equals(p2.getValue());
		return bool2; 
	}
	
	public static <T extends Number> int compare(T t1, T t2) {  
		// Number 클래스를 상속하는 하위 클래스만 매개값으로 올 수 있는 제한을 걸어줌.
		double d1 = t1.doubleValue();
		double d2 = t2.doubleValue();
		return Double.compare(d1, d2);
	}
	
}
