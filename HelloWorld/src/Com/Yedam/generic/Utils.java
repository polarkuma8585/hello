package Com.Yedam.generic;

public class Utils {

	public static <K, V> V getValue(Pair<K, V> p1, K p2) {
		if (p1.getKey().equals(p2)) {
			return p1.getValue();
		} else {
			return null;
		}

	}

}
