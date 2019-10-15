package Com.Yedam.lambda;

public class RunnableExample {
	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("a=>" + i);
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

				}
			}

		};

		Thread thread = new Thread(runnable);
		thread.start();

//		thread = new Thread(() -> {
//			System.out.println("anonymous runnable run.");
//		});
//		thread.start();

		Thread thread2 = new Thread(() -> { //매개값으로 run 메소드를 정의하는 람다식 구문 자체가 와도 가능.
			for (int i = 0; i < 5; i++) {
				System.out.println("b=>" + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		});
		thread2.start();

	}
}
