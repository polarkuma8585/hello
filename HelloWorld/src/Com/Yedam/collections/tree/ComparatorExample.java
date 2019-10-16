package Com.Yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}
}

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
//		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
		TreeSet<Fruits> tSet = new TreeSet<>((a, b) -> {
			if (a.price < b.price)
				return 1;
			else if (a.price == b.price)
				return 0;
			else
				return -1;
		});

		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("dddd", 50));
		Iterator<Fruits> iter = tSet.iterator(); // Iterator - 반복자
		while (iter.hasNext()) {
			Fruits f = iter.next();
			System.out.println(f.name + ", " + f.price);
		}

	}
}
