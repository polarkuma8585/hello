package Com.Yedam.abstractPkg;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound(); // 정의되는 부분이 없는 메소드 - 추상메소드

}

class Cat extends Animal {
	@Override
	public void sound() {
		System.out.println("야옹.");
	}
}

class Dog extends Animal {

	@Override
	public void sound() {
		System.out.println("멍멍.");
	}

}
