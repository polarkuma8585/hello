package Com.boardPkg.control;

public class BoardMain {
	public static void main(String[] args) {
		BoardProc bp = new BoardProc();
		try {
			bp.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
