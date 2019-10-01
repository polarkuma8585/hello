package Com.Yedam.generic;

public class Utils {

	public static <V extends Pair, K> void getValue(Pair<K,V>p1, Pair<K,V>p2) {
		boolean bool1 = p1.getKey().equals(p2.getKey());
		if(bool1 == true) {
			return  
		}else { 
			return null;
		}
		
	}
}
