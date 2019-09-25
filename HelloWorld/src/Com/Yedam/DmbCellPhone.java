package Com.Yedam;

public class DmbCellPhone extends CellPhone {
	int channel;

	public DmbCellPhone(int channel) {
		super(); // 부모 생성자 호출. 부모 클래스의 매개값이 없는 기본 생성자가 있어야 함.
		this.channel = channel;
	}

	public DmbCellPhone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);
		this.channel = channel;
		// TODO Auto-generated constructor stub
	}

	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 방송수신을 시작합니다.");
	}

	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 변경합니다.");

	}

	void turnOffDmb() {
		System.out.println("DMB 방송을 종료합니다.");
	}

}
