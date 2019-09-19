package Classes;

public class CarExample {
	public static void main(String[] args) {
		Car car1 = new Car(); // 인스턴스 실체를 만듦.
//		System.out.println(car1); 
		car1.model = "그랜저";
		car1.color = "red";
		car1.price = 1000;
		car1.maxSpeed = 200;
		
//		System.out.println(car1.model);
//		System.out.println(car1.color);
//		System.out.println(car1.price);
//		System.out.println(car1.maxSpeed);
//		car1.drive();
		
		Car car2 = new Car();
		int[] inAry = new int[5];
		Car[] carAry = new Car[2]; //데이터 타입으로도 쓸 수 있음.
		String[] strAry = null;
		
		car2.model = "소나타";
		car2.color = "Black";
		car2.price = 1500;
		car2.maxSpeed = 250;
//		car2.drive();

		carAry[1] = car2;
		
		for(Car c : carAry) {
			System.out.println(c.model+","+c.color);
		}
	}
}
