package Com.Yedam.lambda;

interface MyInterfaceNoArgs { // 매개값 없음

	public void method1();

}

interface MyInterfacewithArgs { // 매개값 있음
	public void method2(int a);
}

interface MyInterfacewithReturn { // 매개값 있음, 리턴값 있음.
	public int method3(int a, int b);

}

public class LambdaBasicExample2 {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> {
			System.out.println("no arguments expression.");
		};
		fina.method1();

		MyInterfacewithArgs fiwa = (a) -> {
			System.out.println("result is " + (a * 3));
		};
		fiwa.method2(5);
		MyInterfacewithReturn fiwr = (a, b) -> {
			return a + b;
		};
		int result = fiwr.method3(5, 10);
		System.out.println("결과값은: "+ result );
	}
}
