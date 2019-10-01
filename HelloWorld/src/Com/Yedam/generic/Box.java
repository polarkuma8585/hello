package Com.Yedam.generic;

public class Box<T> { // 인스턴스 생성시에 타입을 정해서 생성할 수 있게 함.
//	private Object obj; // 모든 클래스의 최상위 클래스이기 때문에 모든 타입을 다 담을 수 있음.
	private T obj;
	
	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
}
