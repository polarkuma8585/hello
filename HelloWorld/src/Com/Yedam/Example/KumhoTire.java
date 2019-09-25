package Com.Yedam.Example;

public class KumhoTire extends Tire {
	KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);

	}

	@Override
	boolean roll() {
		this.accumulatedRotation++;
		if (maxRotation > accumulatedRotation) {
			System.out.println(location + " 타이어 수명: " + (maxRotation - accumulatedRotation) + " 회");
			return true;
		} else {
			System.out.println("***" + location + "Kumho 타이어펑크 ***");
			return false;
		}
	}
}
