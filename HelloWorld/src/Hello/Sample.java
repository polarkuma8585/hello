package Hello;

public class Sample {
	public static void main(String[] args) {
		int num1= 10;
		num1++; //num1= num +1;
		int a = 5, b = 7;
		num1 = a++ + ++b; // a++ -> 6 , ++b = -> 8 
		System.out.println(a + "," + b);
		System.out.println("num:" + num1); 
		
		System.out.println(3 < 5);
		if(3>5)
			System.out.println("OK");
		//else
		//	System.out.println("NO");
		
		num1 += 3; // num1 = num1 + 3
		num1 *= 3; // num1 = num1 * 3
	}
}
