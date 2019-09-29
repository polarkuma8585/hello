package API;

public class Member3Example {
	public static void main(String[] args) {
		// 원본 객체 생성
		Member3 original = new Member3("홍길동", 25, new int[] { 90, 90 }, new Car("소나타"));

		// 복제 객체를 얻은 후에 참조 객체의 값을 변경
		Member3 cloned = original.getMember();
		cloned.scores[0] = 100;
		cloned.car.model = "그렌저";

		System.out.println("[복제 객채의 필드값]");
		System.out.println("name: " + cloned.name);
		System.out.println("age: " + cloned.age);
		System.out.println("scroes:  {");
		for (int i = 0; i < cloned.scores.length; i++) {
			System.out.println(cloned.scores[i]);
			System.out.println((i == (cloned.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + cloned.car.model);

		System.out.println();

		System.out.println("[원본 객채의 필드값]");
		System.out.println("name: " + original.name);
		System.out.println("age: " + original.age);
		System.out.println("scroes:  {");
		for (int i = 0; i < original.scores.length; i++) {
			System.out.println(original.scores[i]);
			System.out.println((i == (original.scores.length - 1)) ? "" : ",");
		}
		System.out.println("}");
		System.out.println("car: " + original.car.model);

		System.out.println();

	}
}
