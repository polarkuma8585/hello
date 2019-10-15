package Com.Yedam.lambda;

import java.util.function.IntSupplier;

public class LambdaExample {
	public static int method (int x, int y) {
		IntSupplier supplier = ()->{
			x *= 10; // 매개값에 대한 재정의 불가. 
			int result = x + y;
			return result;
		};
		int result = supplier.getAsInt();
		return result;
	}
}
