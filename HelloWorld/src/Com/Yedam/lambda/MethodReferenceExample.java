package Com.Yedam.lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	static int staticSum(int x, int y) {
		return x + y;
	}

	int instanceSum(int x, int y) {
		return x + y;
	}
}

public class MethodReferenceExample {
	public static void main(String[] args) {
		int a = 10, b = 20, result = 0;
		Calculator.staticSum(a, b);

		Calculator cal = new Calculator();
		cal.instanceSum(a, b);

		IntBinaryOperator oper;
//		oper = new IntBinaryOperator() {
//
//			@Override
//			public int applyAsInt(int left, int right) {
//				return Calculator.staticSum(left, right);
//			}
//
//		};
		
//		oper = ((left, right)->{ 
//			return Calculator.staticSum(left, right);
//					});
//		
		oper = Calculator::staticSum; // static 메소드 참조 람다식.
		result = oper.applyAsInt(a, b);
		System.out.println("정적메소드참조: "+ result);
		
		oper = cal::instanceSum;		
		result = oper.applyAsInt(b, a); // instance 메소드 참조 람다식.
		System.out.println("인스턴스메소드참조:  "+ result);
	}
}
